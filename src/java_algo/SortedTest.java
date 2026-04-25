package java_algo;

import java.util.Arrays;
import java.util.Collections;

public class SortedTest {
    public static void main(String[] args) {
        int[] arr = {1,13,22,16,14};
        //오름차순 정렬
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
            System.out.println();
        }
        //람다식을 활용한 내림차순 정의
        Integer[] intArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(intArr, Collections.reverseOrder());
        for (Integer i : intArr) {
            System.out.println("i = " + i);
        }

        //내림차순 정렬
        Integer[] integerArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArr, Collections.reverseOrder());
        for (int i : integerArr) {
            System.out.println("i = " + i);
        }

    }

}
