package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void printPrimeNumbers(int printToInclusive) {
        // ПЧ- это число которое делится толко на себя и на 1
        int low = 2;

        while (low < printToInclusive) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag && low != 0 && low != 1)
                System.out.println(low);

            ++low;
        }
    }
    public static void main(String[] args){
        printPrimeNumbers(33);
    }
}
