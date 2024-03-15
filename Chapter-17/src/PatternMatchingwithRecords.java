/**
 * Pattern Matching with Records
 * JDK 21 introduces a convenient way to use pattern matching with records, called record patterns. Given that a record defines the
 * structure of its member variables, or components, this feature simplifies the instanceof-then-cast idiom, tailored specifically to
 * records. With record patterns, you can pass a record pattern as an operand of the instanceof operator, where a record pattern is of the general form :
 *
 * recordName(component-list)
 *
 * and, most importantly, should the instanceof expression match, all the record components become available as local variables.
 * Specifically, the record pattern form of instanceof is :
 *
 * objref instanceof recordName(component-list)
 *
 * f the record pattern matches, each record component variable in the list will be automatically assigned the value of the corresponding
 * record component from the matched objref object..
 *
 *  An object that is null will never match a record pattern, even if its variable declaration is of the correct type. In this example,
 *  the null case is handled explicitly.
 */
public class PatternMatchingwithRecords {
    record Employee (String name, Id id){};
    record Id(int idNum, Type type){
        enum Type{FULL_TIME, PART_TIME}
    }
    public static void printObjectWithoutPatternMatching(Object obj){
        if (obj instanceof Employee employee){
            System.out.println("The employee ID for " +
                    employee.name + " is " +
                    employee.id().idNum + " and the type is " +
                    employee.id().type);

        }else if (obj == null){
            throw new IllegalArgumentException("null is not allowed");
        }else {
            System.out.println("Printing: " + obj.toString());
        }
    }
    public static void printObject(Object obj){
        if (obj instanceof Employee(String empName, Id empId)){
            System.out.println("The employee ID for " +
                    empName + " is " +
                    empId.idNum + " and the type is " +
                    empId.type);

        }else if (obj == null){
            throw new IllegalArgumentException("null is not allowed");
        }else {
            System.out.println("Printing: " + obj.toString());
        }
    }
    public static void printObjectNested(Object obj){
        if (obj instanceof Employee(String empName, Id(int id, Id.Type type))){
            System.out.println("The employee ID for " +
                    empName + " is " +
                    id + " and the type is " +
                    type);

        }else if (obj == null){
            throw new IllegalArgumentException("null is not allowed");
        }else {
            System.out.println("Printing: " + obj.toString());
        }
    }
    public static void main(String[] args) {
        Employee employee = new Employee("hasan", new Id(12, Id.Type.FULL_TIME));

        printObjectWithoutPatternMatching(employee);
        printObject(employee);
        printObjectNested(employee);

    }
}
