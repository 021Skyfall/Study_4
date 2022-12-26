import java.util.Arrays;

public class F_createPhoneNumber {
    public static void main(String[] args) {
//      0-9 사이의 정수를 요소로 갖는 배열을 입력받아 전화번호 형식의 문자열을 리턴해야 합니다.
//      String output = createPhoneNumber(new int[]{0, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8});
//      System.out.println(output); // --> '(010)1234-5678'
        int[] arr = new int[]{0,1,0,1,2,3,4,5,6,7,8}; // 입력
//        int[] arr = new int[]{8, 7, 6, 5, 4, 3, 2, 1};
        
        // head, body, tail로 배열을 자른다. ~> copyOfRange()
        // 문자열로 바꾼다. ~> Arrays.toString()
        // 문제 요구 사항에 맞춘다. ~> replace()
        final int LENGTH = arr.length; // 보기좋게 상수 설정
        
        String head;
        if(LENGTH == 11) {
            head = Arrays.toString(Arrays.copyOfRange(arr,0,3)) // to는 직전 인덱스까지 가져옴
                    .replace(" ","")
                    .replace("[","")
            .replace(",","")
            .replace("]","");
//            .replace(현재 문자열, 바꿀 연자열)
        } else {
            head = "010";
        }
        String body;
            body = Arrays.toString(Arrays.copyOfRange(arr,LENGTH-8,LENGTH-4))
            // 인풋이 적어지면 tail이 이상하게 나오니까 역순으로 기준 잡아야함
                    .replace(" ","")
                    .replace("[","")
             .replace(",","")
             .replace("]","");
        String tail;
            tail = Arrays.toString(Arrays.copyOfRange(arr,LENGTH-4,LENGTH))
                    .replace(" ","")
                    .replace("[","")
            .replace(",","")
            .replace("]","");

        System.out.println(String.format("(%s)%s-%s",head,body,tail));
    }
}
