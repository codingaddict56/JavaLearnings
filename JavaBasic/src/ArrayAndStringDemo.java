import java.util.Scanner;

public class ArrayAndStringDemo {

    public void mathOperation(){
        int[] number = new int[5];


            System.out.println("Enter the array 5 integer values");
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < number.length; i++) {
                number[i] = sc.nextInt();
            }
            System.out.println(number);
                int sum = 0;
            for(int i=1; i< number.length; i++){
                sum = sum + number[i];
            }
            int average = 0;
            average = sum/number.length;
            int max = 0;
            for(int m=0; m<number.length; m++){
                if(max > number[m]){
                    max = number[m];
                };
                System.out.println(max);
            }

            int min = number[0];
            for(int j=0; j< number.length; j++){
                if(number[j] >= min)
                    min = number[j];
            }

            System.out.println(min);

    }

}
