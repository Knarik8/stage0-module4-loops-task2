package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void buildPhrase(char... chars) {
        System.out.println(chars);
//        int len = 0;
//        while (len < chars.length){
//            System.out.println(chars);
//            len ++;
//        }
    }
    public static void main(String[] args){
        buildPhrase('l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l');
    }
}
