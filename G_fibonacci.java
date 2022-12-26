import java.util.Arrays;

public class G_fibonacci {
    public static void main(String[] args) {
//        수(num)를 입력받아 num번째까지 총 num + 1개의 피보나치 수열을 리턴해야 합니다.
//          0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1입니다.
//          그 다음 2번째 피보나치 수부터는 바로 직전의 두 피보나치 수의 합으로 정의합니다.
//          0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
        // 전 숫자와 자기 숫자 더 하는거
        int num = 8; // input
        int[] arr = new int[num + 1]; // 배열의 크기는 입력되는 숫자의 +1 ~> 입력된 숫자 포함해서

        for(int i = 0; i <= num; i++) { // 마찬가지로 num 포함해야 하기 때문에 <=
            if(i <= 1) { // 0과 1 고정 출력시키기 위함
                arr[i] = i;
            } else {
                arr[i] = arr[i-2] + arr[i-1];
                // 자기와 직전 숫자를 더함 ~> 해당 배열 인덱스를 출력해야하기 때문에
                // -2, -1로 위치 찾기
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
