
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        AboutMe aboutMe = new AboutMe();
        aboutMe.setAge(27);
        aboutMe.setName("Chaithra Jagannatha Rao Telkar");
        aboutMe.setSubject("Java Backend cloud project");
        System.out.println("Hi, I'm " + aboutMe.getName() + ", " + aboutMe.getAge() + " years old, and I love working on " + aboutMe.getSubject());

        //Basic Math, Operators
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        BasicMath bc = new BasicMath();
        System.out.println("Sum : " + bc.sum(firstNumber, secondNumber));
        System.out.println("Difference : " + bc.difference(firstNumber, secondNumber));
        System.out.println("Product : " + bc.product(firstNumber, secondNumber));
        System.out.println("Quotient : " + bc.quotient(firstNumber, secondNumber));
        System.out.println("Remainder : " + bc.remainder(firstNumber, secondNumber));
        System.out.println("Is first number greater than second? : " + bc.boolCheck(firstNumber, secondNumber));

        //Loop, Switch, conditional statements
        ControlFlowDemo controlFlowDemo = new ControlFlowDemo();
        controlFlowDemo.dayOfTheWeek();
        controlFlowDemo.usingLoop();

        //
        ArrayAndStringDemo arrayAndStringDemo = new ArrayAndStringDemo();
        arrayAndStringDemo.mathOperation();


    }
}