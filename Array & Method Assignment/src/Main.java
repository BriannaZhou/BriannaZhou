public class Main {

    public static int[] addNumberToArray(int[] inputArray, int num) {

        int[] outputArray = new int[inputArray.length + 1];

        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = inputArray[i];
        }
        int[] outputArray1 = new int[outputArray.length];

        for (int i = 0; i < outputArray.length; i++) {
            outputArray1[i] = outputArray[i];
        }

        outputArray[outputArray.length - 1] = num;
        return outputArray;
    }

    public static int[] deleteNumber(int[] inputArray){

    int[] outputArray = new int[inputArray.length - 1];

    for(int i = 0; i < outputArray.length ; i++) {
        outputArray[i] = inputArray[i];
    }

    int[] outputArray1 = new int[inputArray.length];

    for( int i = 0; i < outputArray.length;i++){
        outputArray1[i] = outputArray[i];
    }
        return outputArray;
}
    public static int[] insertNumber(int [] inputArray, int num, int index) {

        int[] outputArray = new int[inputArray.length + 1];

        for (int i = 0; i < inputArray.length; i++) {
            if (i < index) {
                outputArray[i] = inputArray[i];
            }
            else if (i == index) {
                outputArray [i] = num;
            }
            else {
                outputArray[i + 1 ] = inputArray[i];
            }
        }   return outputArray;




    }



    public static void main(String[] args) {

        //Problem 1:
        System.out.println("Problem 1:");
        int[] inputArray = addNumberToArray(new int[4], 2);
        for (int i : inputArray) {
            System.out.println(i);
        }

        //Problem 2:
        System.out.println("Problem 2");
        int[] outputArray = deleteNumber(new int[4]);
        for (int i : outputArray) {
            System.out.println(i);
        }

        //Problem 3:
        System.out.println("Problem 3");
        int [] outputArray1 = insertNumber(new int[4], 2, 2);
        for ( int i : outputArray1) {
            System.out.println(i);
        }



    } }




