import java.util.InputMismatchException;
import java.util.Scanner;

public class Main6 {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int[] myArray = {12, 3, 4, 5};
//
//        try {
//            System.out.print("Enter a number: ");
//            int numberFromKeyboard = scan.nextInt();
//            System.out.println(myArray[numberFromKeyboard]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Numarul nu se afla in intervalul [0 - " + (myArray.length - 1) + "]");
//        } catch (InputMismatchException e) {
//            System.out.println("Valoarea introdus [" + scan.nextLine() + "] nu este un numar.");
//        }
//
//        System.out.println("aici");


        Read read = new Read();
        System.out.println("numarul introdus e: " + read.getInt());
    }
}
