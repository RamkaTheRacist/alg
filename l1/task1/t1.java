package Algorithm.l1.task1;

import java.util.ArrayList;
import java.util.List;

public class t1 {
    public static List<Integer> findAvailableDivider(int number) {      // линейная сложность
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> findSimpleNumbers(int max) {            //квадратичная
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            if(findAvailableDivider(i).size() <= 2){
                result.add(i);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(findSimpleNumbers(100));

    }
}
