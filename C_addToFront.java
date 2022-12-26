import java.util.Arrays;

public class C_addToFront {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2};
        int el = 3;

        int[] result = new int[arr.length + 1]; // result의 주소 크기 지정 ~> el이 들어갈 한 자리 더 있어야되니까
        result[0] = el;                         // 기존 arr 자리 + 1
        System.arraycopy(arr,0,result,1,arr.length);
        // arr 복사, 0부터 읽어옴, 복사하려는 대상, 복사대상에서 복사 시작할 위치, 얼만큼 읽어올지
        //https://eunplay.tistory.com/118
        // 풀어서 보면 arr를 result에 복사할거고, arr의 0부터 arr.length까지 가져올거임
        // result의 1부터 붙여넣음
        System.out.println(Arrays.toString(result));
    }
}
