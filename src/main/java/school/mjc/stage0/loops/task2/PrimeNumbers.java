package school.mjc.stage0.loops.task2;

import javax.net.ssl.SSLContext;

public class PrimeNumbers {
    public static void printPrimeNumbers(int printToInclusive) {
        // ПЧ- это число которое делится толко на себя и на 1
        int counter = 5; // 3, 4, 5,
        int divider = 2; // 2, 3, 4, 5

        while (counter <= printToInclusive) {
            while (divider < counter) {
                if (counter % divider == 0) {
                    counter++;
                } else if (counter % divider != 0) {
                    divider++;
                    System.out.println(counter);
                }
            }
        }
    }
    public static void main(String[] args){
        printPrimeNumbers(33);
    }
}
