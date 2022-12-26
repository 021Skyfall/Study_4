public class ArrayLoop {
    public static void main(String[] args) {
        int[] scores = { 100, 90, 85, 95, 100 };
        int sum = 0;
//        for(int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//        }
//        System.out.println(sum);
//        int i = 0;
//        while (i < scores.length) {
//            sum += scores[i++];
//        }
//        System.out.println(sum);

        for(int score : scores) {
            sum += score;
        }
        System.out.println(sum);

        // for과 while, Enhanced for로 배열 탐색이 가능하지만 Enhanced for는 배열 탐색 후 수정 안됨
    }
}
