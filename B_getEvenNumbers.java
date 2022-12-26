import java.util.Arrays;

public class B_getEvenNumbers {
    public static void main(String[] args) {
//      int 타입를 요소로 갖는 배열을 입력받아 짝수만을 요소로 갖는 배열을 리턴해야 합니다.
        int[] arr = new int[] {1,2,3,4,5,6}; // 입력값

        int[] num = new int[]{}; // 결과로 출력할 빈 공백 배열
        if(arr.length == 0) { // 예외 상황 먼저 걸러내기
            System.out.println(new int[]{});
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0) { // arr에서 짝수 찾아내기
                num = Arrays.copyOf(num,num.length+1);
                // 요소 들어갈 자리 생성
                // copy of == 원본 배열 복사 // length 하나씩 더해서 길이 늘리기
                //https://taeil00.tistory.com/193
                 num[num.length-1] = arr[i];
                 // 위의 copyOf는 num의 요소가 들어갈 자리를 만들어줌(주소를 생성)
                // 현재의 식으로 해당 자리에 걸러낸 arr의 인덱스에 해당하는 요소를 집어 넣음
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
