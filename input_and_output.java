import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class input_and_output {
    public static void main (String[] args) {
        try {
            File file = new File("out.txt");
            Scanner scc = new Scanner(file);//try catch 사용해줘야함
            Scanner sc = new Scanner(System.in); //사용자가 직접 입력한 값
//        int i = sc.nextInt(); // 입력값을 기다림 (정수 값을 받음)
//        System.out.println(i*1000);
            while (scc.hasNextInt()) {// 정수값을 받을 때마다 실행
                System.out.println(scc.nextInt() * 100);
            }
            scc.close();
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
