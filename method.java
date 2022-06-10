public class method {
    public static void numbering() {//define
        int i = 0;
        while (i<10) {
            System.out.println(i);
            i++;
        }
    }
    public  static void number(int init, int limit) {
        System.out.println("number function start...");
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
    public static String numbers(int init, int limit) {//String-> numbers 의 리턴값이 문자열이다
        System.out.println("numbers function start...");
        int i = init;
        String output = "";
        while (i < limit) {
            output += i;
            i++;
        }

        return output;
    }
    public static String[] getmembers() {
        String[] members = {"adam", "bale", "cristiano"};
        return members;
    }
    public static void main(String[] args) {//void 매소드의 리턴 값은 존재하지 않음을 선언
        numbering();//call
        number(2, 5);
        System.out.println(numbers(1, 6));
        System.out.println(getmembers());
        String[] members = getmembers();
        System.out.println(members[0]);
    }
}
