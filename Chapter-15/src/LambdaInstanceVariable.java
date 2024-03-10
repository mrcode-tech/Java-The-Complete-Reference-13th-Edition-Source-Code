public class LambdaInstanceVariable {
    private int instanceVariable = 5;

    public void demonstrateLambda() {
        int localVariable = 10;  // effectively final

        // Lambda expression accessing and modifying instanceVariable
        Runnable myRunnable = () -> {
            instanceVariable += localVariable;  // Lambda can access and modify instanceVariable
            System.out.println("Modified instanceVariable: " + instanceVariable);
        };

        // Calling the lambda expression
        myRunnable.run();
    }

        public static void main(String[] args) {
            LambdaInstanceVariable lambdaExample = new LambdaInstanceVariable();
            lambdaExample.demonstrateLambda();
        }
}
