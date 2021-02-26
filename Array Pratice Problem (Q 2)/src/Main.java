import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        //Problem 2
        int arr[] = new int[10];
        int total = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100+1);
            total = total + arr[i];
            avg = total / 10;
            System.out.println(arr[i]);
        }
        System.out.println("The average of the values: " + avg);


        System.out.println("problem 3:");
        //Problem 3:
        int x = arr[8];
        int y = arr[6];
        int z = 0;
        z = x;
        x = y;
        y = z;
        arr[8] = arr[6];
        arr[6] = x;
        System.out.println(x);
        System.out.println(y);


        //Problem 4:
        System.out.println("Problem 4:");
        int arr2[] = new int[10];
        for (int r = 0; r < arr2.length; r++) {
           arr2[r] = arr[arr.length -1 - r];

/*
            arr2[0] = arr[9];
            arr2[1] = arr[8];
            arr2[2] = arr[7];
            arr2[3] = arr[6];
            arr2[4] = arr[5];
            arr2[5] = arr[4];
            arr2[6] = arr[3];
            arr2[7] = arr[2];
            arr2[8] = arr[1];
            arr2[9] = arr[0];
*/
            System.out.println(arr2[r]);
        }






        }
        }













