import java.util.Scanner;

/*
Create a new class ControlFlowDemo.java that does this:

Ask the user to enter a number between 1 and 7

Use a switch to print the day of the week
(1 = Monday, 2 = Tuesday, ... 7 = Sunday)

If the user enters an invalid number, print “Invalid day number”

Then, use a for loop to print all numbers from 1 to the entered number

Skip number 3 using continue

Stop completely if number > entered number

Finally, print how many numbers were actually printed.
 */

public class ControlFlowDemo {

    public void dayOfTheWeek(){

        Scanner scanner = new Scanner(System.in);
        int day = 0;
        System.out.println("Enter a number between 1 and 7: " + day );
        day = scanner.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

            default -> System.out.println("Invalid day number");

        }

    }

    public void usingLoop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        System.out.println("Counting up to :" +  number);
        int count = 0;
        for(int n = 1; n <=number ; n++){
            if(n==3) { continue;  };
        System.out.println(n);

            count++;
        }
        System.out.println("Printed " + count + " numbers");

    }
}
