package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive > 0) {
            int counter = 0;
            while (counter <= multiplyByAndToInclusive) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter++;
            }
        }
        if (multiplyByAndToInclusive < 0) {
            int counter = 0;
            while (counter >= multiplyByAndToInclusive){
                System.out.println(-counter*multiplyByAndToInclusive);
                counter--;

            }
        }
    }
    public static void main(String[] args){
        printMultiplied(5);
    }
}
