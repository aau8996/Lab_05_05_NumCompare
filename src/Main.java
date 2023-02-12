public class Main {
    public static void main(String[] args) {
        // Variables/Inputs from the user
        double firstNumber = 6;
        double secondNumber = 9;
        // Initial prompt from the program
        System.out.println("What is your first number?");
        System.out.println("What is your second number?");
        // If firstNumber > secondNumber then
        if(firstNumber > secondNumber){
            // Output
            System.out.println(secondNumber + " is less than " + firstNumber);
        }
        // else if firstNumber = secondNumber then
        else if(firstNumber == secondNumber){
            // Output
            System.out.println(firstNumber + " is equal to " + secondNumber);
        }
        // else
        else{
            // Output
            System.out.println(firstNumber + " is less than " + secondNumber);
        }
    }
}