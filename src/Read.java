import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {

    public int getInt() {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        boolean repeat = true;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                number = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("The value [" + scan.nextLine() + "] is not a numeric value.\n" +
                        "Please try again!");
            }
        }
        return number;
    }

    public int[] getArrayOfNumbers(int length) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++){
            array[i] = getInt();
        }

        return array;

    }


}
