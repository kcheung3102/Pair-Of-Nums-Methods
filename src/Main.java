import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input first number: ");
        int firstNum = input.nextInt();

        System.out.println("Input second number: ");
        int secondNum = input.nextInt();

        if (isValid(firstNum, secondNum) & sum(firstNum, secondNum) == 21){
            System.out.println(sum(firstNum, secondNum) + "*");
        } else if (isValid(firstNum, secondNum)) {
            System.out.println(sum(firstNum, secondNum));
        }
    }
    private static int sum (int firstNum, int secondNum){
        int sum = firstNum + secondNum;
        return sum;
    }
    //user input errors
    private static boolean isValid(int firstNum,int secondNum) {
        if(firstNum == 0 & secondNum == 0) {
            System.out.println("Goodbye");
            return false;
        } else {
            return true;
        }

    }
}
