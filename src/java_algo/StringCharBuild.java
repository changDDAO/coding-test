package java_algo;

import java.util.Arrays;

public class StringCharBuild {
    public long solution(long n) {

        String num = String.valueOf(n);
        String [] nums = num.split("");
        //1안
        /*String temp = Arrays.stream(nums)
        .sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        */
        //2안
        /*
        String [] temp =Arrays.stream(nums).sorted(Collections.reverseOrder()).toArray(String[]::new);
        String answer = String.join("",temp);
        return Long.parseLong(answer);
        */
        //3안
        char [] chars = num.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder(new String(chars));
        String temp = sb.reverse().toString();
        System.out.println(temp);
        return 0;
    }
}
