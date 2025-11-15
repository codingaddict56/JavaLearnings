

public class BasicMath {


    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int difference(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;

    }

    public int product(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int quotient(int firstNumber, int secondNumber) {
        if(secondNumber == 0)
            return 0;
        return firstNumber / secondNumber;
    }

    public int remainder(int firstNumber, int secondNumber) {
        if(secondNumber == 0)
            return 0;
        return firstNumber % secondNumber;
    }
    public boolean boolCheck(int firstNumber, int secondNumber){
        return firstNumber > secondNumber;
    }
}
