package java_lecture_121_;
import java.io.*;
class B{
    void run() throws FileNotFoundException, IOException{// 파일못찾음 예외를 클래스 C에 던짐
        BufferedReader bReader = null;
        bReader = new BufferedReader(new FileReader("C:/Users/shhmu/IdeaProjects/sample/src/input.txt"));
        String input = null;
        input = bReader.readLine();
        System.out.println(input);
    }
}
class C{
    void run(){
        B b = new B();
        try{
            b.run();
        } catch (FileNotFoundException e){//클래스 B에서 던진 예외를 받아야함
            System.out.println("File not found");
        } catch (IOException e) { //IOException -> 파일 읽고쓰는 것에대한 에러
//            FileNotFoundException을 포함함
            e.printStackTrace();
        }
    }
}
public class ThrowExceptionDeom {
    public static void main(String[] args){
        C c = new C();
        c.run();
    }
}
