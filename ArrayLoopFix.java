import java.util.Arrays;

public class ArrayLoopFix {
    public static void main(String[] args) {
        int[] scores = { 100, 90, 85, 95, 100 };

        for (int i = 0; i < scores.length; i++) {
            scores[i] = 0;
        }
        System.out.println(Arrays.toString(scores));
        //for문으로 배열 요소 값 변경

        int j = 0;
        while (j < scores.length) {
            scores[j++] = 1;
        }
        System.out.println(Arrays.toString(scores));
        //while문으로 배열 요소 값 변경
        
        //Enhanced for 는 불가능
    }
}
