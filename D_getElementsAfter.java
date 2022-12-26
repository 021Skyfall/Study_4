import java.util.Arrays;

public class D_getElementsAfter {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int n = 2;
//        if(n >= arr.length) {
//            return new int[]{};
//        }
        int[] result = Arrays.copyOfRange(arr,n,arr.length);
        System.out.println(Arrays.toString(result));
//      https://taeil00.tistory.com/193
//      Arrays.copyOfRange(원본, 복사시작위치, 복사끝위치)  
//        숫자가 순서대로 입력되니까 가능한듯
    }
}
