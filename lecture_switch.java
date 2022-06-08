public class lecture_switch {
    public static void main(String[] args){
        System.out.println("switch(1)");
        switch (1){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }// case 1부터 순차적으로 끝까지 실행
        switch (2){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }// case 2부터 순차적으로 끝까지 실행
        switch (3){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }// case 3 실행
        switch (1){
            case 1:
                System.out.println("one");
                break;// break 문을 만나면 switch문을 빠져나옴
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
        }
        switch (4){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:// switch의 조건이 case의 어느 조건에도 해당되지 않으면 default문을 실행
                System.out.println("default");
        }// switch 조건은 byte, short, char, int, enum, String, Character, Byte, Short, Integer 타입으로 제한
    }
}
