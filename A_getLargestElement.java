public class A_getLargestElement {
    public static void main(String[] args) {
//      배열을 입력받아 가장 큰 요소를 리턴해야 합니다.
        int[] arr = new int[] {1, 8, 3, 9, 5};
        int max = arr[0]; // 여기서 배열 인덱스가 0으로 정해졌는데
        for(int i = 0; i < arr.length; i++) {
                if (arr[i] > max) { // 그럼 여기서는 0 > 0 , 1 > 0 , 2 > 0 이런식으로 비교되는거 아닌가?
                    max = arr[i];   // 그렇게 비교되는데 어떻게 중간 쯤에 있는 9가 출력되는거지?
                } // 아 알겠다 if 안의 내용이 반복되면서 max 값이 arr의 인덱스 반복되는 만큼 계속 변하니까
            //변한 맥스랑 다음 arr 인덱스 값이랑 또 비교하고 그렇게 반복해서 마지막에 제일 큰 값이 남는거네
            // 아 ㅋㅋ 그러니까 간단하게 if 안의 값도 계속 반복되고 그럴 때마다 max값이 제일 큰 값으로 변경
            // 결국 제일 큰값이 저장되는거임 나머지는 전부 false니까
            }
        System.out.println(max);
        }
    }

