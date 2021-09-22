import java.util.Scanner;

public class basicJavaCalculator {
    
    public static void main(String[] args) {
        //Welcome
        System.out.println("Welcome to the basic calculator in Java");
        System.out.println(" ");

        //Getting user input
        System.out.print("Input your first number: ");
        Scanner userInput = new Scanner(System.in);
        double number1 = userInput.nextDouble();
        System.out.print("Input your second number: ");
        double number2 = userInput.nextDouble();
        System.out.print("Input the arithmatic operator you want to perform: ");
        char operator = userInput.next().charAt(0);
        
        //operation
        double answer;
        switch(operator){

            case '+': answer = number1 + number2;
            break;
            case '-': answer = number1 - number2;
            break;
            case '/': answer = number1 / number2;
            break;
            case '*': answer = number1 * number2;
            break;
            default: System.out.println("Entered operator isn't valid (or isn't a basic operator)");
            return;
        }
        
        //Displaying final result
        System.out.println(" ");
        System.out.println("Here's your result");
        System.out.println( number1 + " " + operator + " " + number2 + " = " + answer );

    }
    
}
