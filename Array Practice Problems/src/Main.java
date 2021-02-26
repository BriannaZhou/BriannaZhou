import java.text.Format;

public class Main {
    public static void main(String[] args) {

        //problem 1:
        int[] arr = new int[20];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*6+1);
            System.out.println(arr[i]);
        }
        for (int i =0; i< arr.length; i++){
            if(arr[i] == 1){
                count++;
        }
        }
        System.out.println("One's Count: " + count);
    }
}