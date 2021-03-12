public class Main {

    public static void main(String[] args) {


        Time time = new Time(22, 16, 17);
        System.out.println(time);
        time.previousSecond();
        System.out.println(time.toString());
        time.nextSecond();
        System.out.println(time.toString());
    }
}