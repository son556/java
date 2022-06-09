public class loop {
    public static void main(String[] args){
        int n = 0;
        while (n < 21) {
            System.out.println(n);
            n++;
        }
        for (int i = 0; i < 20; i++){
            if (i == 10) // if 문의 실행문이 1줄이면 이와 같이 {}을 생략 할 수 있다.
                break;
            System.out.println("coding everyday" + i);
        }
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 0; i < 20; i++){
            if (i == 10) // if 문의 실행문이 1줄이면 이와 같이 {}을 생략 할 수 있다.
                continue;// for 의 첫줄로 돌아감 --> 10은 생략
            System.out.println("coding everyday" + i);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i+" "+j);
            }
        }
    }
}
