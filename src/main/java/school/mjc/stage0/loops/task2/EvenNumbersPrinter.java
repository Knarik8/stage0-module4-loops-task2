package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public static void printEvenNumbers(int printTillInclusive) {
        int counter = 2;
        while (counter <= printTillInclusive){
            if (counter % 2 == 0){
                System.out.println(counter);
            }
            counter++;
        }
    }
    public static void main(String[] args){
        printEvenNumbers(2);
    }
}
