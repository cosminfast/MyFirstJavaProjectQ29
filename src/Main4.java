public class Main4 {

    public static void main(String[] args) {

        LogicalOperations op = new LogicalOperations();

        int[] myArray = op.getArrayOfValues(100);

        int[] mySecondArray = {1,2,3,56666,1231,123123123};

//        op.printArray(mySecondArray);
//        System.out.println();
//        System.out.println(op.getAverageFromArray(myArray));


//        System.out.println(op.getIndexForValue(myArray, 200));

        int position = op.getIndexForValue(mySecondArray, 11231);
        if (position == -1){
            System.out.println("valoarea nu exista in array");
        }else {
            System.out.println(position);
        }

//        System.out.println(op.isValueInArray(myArray, 5));

        if (op.isValueInArray(myArray, 5876)){
            System.out.println("value in array");
        }else {
            System.out.println("value not in array");
        }


    }
}
