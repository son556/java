public class conditional {
    public static void main(String[] args){
        System.out.println(1==2);
        System.out.println(1==1);
        System.out.println("one" == "two");
        System.out.println("one"=="one");
        System.out.println("one"=="One");
        System.out.println(1 != 2);
        System.out.println("one"!= "two");
        System.out.println(10 > 20);
        System.out.println(10 < 20);
        String a = "hello world";
        String b = new String("hello world");
        System.out.println(a == b); // false
        System.out.println(a.equals(b));//문자열 비교시 .equals 사용
        if(true){
            System.out.println("result : true");
        }
        if(false){
            System.out.println("result : true");
        }
        if(false){
            System.out.println(1);
        } else {
            System.out.println(2);
        }

        if(a.equals(1)){
            System.out.println(1);
        } else if(a.equals(2)) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
        String id = args[0];
        String password = args[1];
        if(id.equals("egoing")){
            if(password.equals("111")){
                System.out.println("right");
            } else{
                System.out.println("password wrong");
            }
        } else {
            System.out.println("wrong");
        }
    }
}
