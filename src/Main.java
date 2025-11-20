import java.util.*;

public class Main {
    public static void main(String[] args) {

        int size = 10_000;
        List<Integer> numb = new ArrayList<>(size);


        Random fun = new Random();

        for(int i = 0; i < size; i++){

            numb.add(fun.nextInt(100));

        }

        long startSeq = System.currentTimeMillis();
        int sum1 = numb.stream()
                .map(n -> n*2)
                .mapToInt(n -> n)
                .sum();
        long endSeq = System.currentTimeMillis();


        long startPara = System.currentTimeMillis();
        int sum2 = numb.parallelStream()
                .map(n -> n*2)
                .mapToInt(n -> n)
                .sum();
        long endPara = System.currentTimeMillis();

        System.out.println(sum1 + " : " + (endSeq - startSeq));
        System.out.println(sum2 + " : " + (endPara - startPara));



    }
}