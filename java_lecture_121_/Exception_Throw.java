package java_lecture_121_;
import java.io.*;
public class Exception_Throw {
    public static void main(String[] args){
        BufferedReader bReader = null;
        try{
            bReader = new BufferedReader(new FileReader("C:/Users/shhmu/IdeaProjects/sample/src/input.txt"));
        } catch (FileNotFoundException e){// 무조건 처리해야하는 예외
            e.printStackTrace();
        }
        String input = null;
        try{
            input = bReader.readLine();
        } catch (IOException e){// 무조건 처리해야하는 예외
            e.printStackTrace();
        }
        System.out.println(input);
    }
}
