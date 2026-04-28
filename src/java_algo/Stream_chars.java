package java_algo;

public class Stream_chars {
        public int[] solution(long n) {
            StringBuilder sb = new StringBuilder(String.valueOf(n));
            //값 뒤집기
            sb.reverse();
            String num = sb.toString();
            int [] answer = num.chars().map(Character::getNumericValue).toArray();
            return answer;
        }

}
