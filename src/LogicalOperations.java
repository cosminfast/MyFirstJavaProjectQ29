public class LogicalOperations {

    public int getGreaterNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String textAndNumberComp(String textInput, int numberInput) {
        if (textInput.equals("FastTrack") && numberInput <= 3) {
            return textInput + numberInput;
        } else if (!textInput.equals("FastTrack") && numberInput >= 4) {
            return numberInput + textInput;
        }
        return "No condition was met";
    }

    //Given a text input, if it is “FastTrack”,
    // then print “Learning text comparison”. If not, print “Got to try some more”

    public String textComparison(String textInput) {
        if (textInput.equals("FastTrack")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public void printFromNumberTo100(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public float sumAndAverage() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return sum / 100f;
    }

    public void printFromFirstToLast(int first, int last) {
        while (first <= last) {
            System.out.println(first);
            first++;
        }
    }
    //Modify the program to sum from 111 to 8899,
    // and compute the average.
    // Introduce an int variable called count to count the numbers
    // in the specified range.

    public float averageFromNumberToNumber(int first, int last) {
        float sum = 0;
        int count = 0;
        while (first <= last) {
            sum = sum + first;
            first++;
            count++;
        }
        return sum / count;
    }

    public float getAverageNumbersInInterval(int first, int second) {
        float sum = 0;
        int count = 0;
        while (first <= second) {
            if (first % 7 == 0) {
                sum += first;
                count++;
            }
            first++;
        }

        return sum / count;
    }

    public void printCozaLozaWoza() {
        int i = 1;
        while (i <= 110) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else {
                System.out.print(i + " ");
            }

            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }

    public int[] getArrayOfValues(int positions) {
        int[] myArray = new int[positions];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }

    public void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }

    public float getAverageFromArray(int[] myArray) {

        float sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        return sum / myArray.length;
    }

    public int getIndexForValue(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean isValueInArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }

        }
        return false;
    }
}
