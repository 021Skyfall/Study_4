import java.util.Arrays;

public class E_getAllElementsButNth {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = 1;

        int[] result = new int[arr.length - 1]; 
        // result라는 새로운 배열 만들고 그 크기는 n의 자리가 빠질꺼니까 기존 배열의 -1
        int index = 0; // 해당 인덱스 자리 특정 해줄 변수
        for (int i = 0; i < arr.length; i++) { // n에 맞는 인덱스 위치 검사 시작
            if (i == n) {
                continue; // true값 조정 (전체 검사를 위함)
            }
            result[index] = arr[i]; // 여기 이해 안가니까 다시
            index++;
        }
            System.out.println(Arrays.toString(result));
    }
}