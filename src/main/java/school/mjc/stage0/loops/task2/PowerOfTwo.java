package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void printPower(int power) {
        if (power > 0) {
            int counter = 0;
            while (counter <= power) {
                System.out.println(Math.pow(2, counter));
                counter++;
            }
        } else {
            System.out.println("too much power");
        }
    }
    public static void main(String[] args){
        printPower(5);
    }
}
