// Use a non-canonical constructor in a record.

// Declare an employee record that explicitly declares both
// a canonical and non-canonical constructor.
record Employee2(String name, int idNum) {

    // Use a static field in a record.
    static int pendingID = -1;

    // Use a compact canonical constructor to remove any leading and
    // trailing spaces from the name string.
    public Employee2 {
        // Remove any leading and trailing spaces.
        name = name.trim();
    }

    // This is a non-canonical constructor. Notice that it is
    // not passed an ID number. Instead, it passes pendingID to the
    // canonical constructor to create the record.
    public Employee2(String name) {
        this(name, pendingID);
    }
}

class RecordDemo3 {
    public static void main(String[] args) {
        Employee2[] empList = new Employee2[4];

        // Create a list of employees that uses the Employee record.
        empList[0] = new Employee2("Doe, John", 1047);
        empList[1] = new Employee2("Jones, Robert", 1048);
        empList[2] = new Employee2("Smith, Rachel", 1049);

        // Here, the ID number is pending.
        empList[3] = new Employee2("Martin, Dave");

        // Display names and IDs.
        for (Employee2 e : empList) {
            System.out.print("The employee ID for " + e.name() + " is ");
            if (e.idNum() == Employee2.pendingID) System.out.println("Pending");
            else System.out.println(e.idNum());
        }
    }
}
