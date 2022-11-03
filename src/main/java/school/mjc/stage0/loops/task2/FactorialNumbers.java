package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void printFactorialRow(int printToInclusive) {
        int counter = 1;
        int total = 1;
        while (counter <= printToInclusive){
            System.out.println(total *= counter);
            counter++;
        }
    }
    public static void main(String[] args){
        printFactorialRow(7);
    }
}
