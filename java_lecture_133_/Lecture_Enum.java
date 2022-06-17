package java_lecture_133_;
//class Fruit{
//    public static final Fruit APPLE = new Fruit();
//    public static final Fruit PEACH = new Fruit();
//    public static final Fruit BANANA = new Fruit();
//}
enum Fruit{ //위와 같다
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    public String color;
    public String getColor(){
        return this.color;
    }
    Fruit(String color){
        System.out.println("Call Constructor");
        this.color = color;
    }
}
enum Company{// 열거를 위한 코드임을 선언 enum
    GOOGLE, APPLE, ORACLE
}
public class Lecture_Enum {
//    private final static int APPLE = 1;// final 선언시 한번선언하면 값이 안바뀜
//    private final static int PEACH = 2;
//    private final static int BANANA = 3;
//    interface FRUIT{
//        int APPLE = 1, PEACH = 2, BANANA = 3;
//    }
//    interface COMPANY{
//        int GOOGLE = 1, APPLE = 2, ORACLE = 3;
//    }
    public static void main(String[] args) {
        Fruit type = Fruit.APPLE;
        switch (type){
            case APPLE:
                System.out.println(57 + " kcal, color "+ Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34 + " kcal, color "+ Fruit.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93 + " kcal, color "+ Fruit.BANANA.getColor());
                break;
        }
//        if (Fruit.APPLE == Company.APPLE){ // 이름이 같아 생기는 혼동 방지 enum
//            System.out.println("same");
//        }
    }
}
