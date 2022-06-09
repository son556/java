public class logic {
    public static void main(String[] args){
        if (true && true) {
            System.out.println(1);
        }
        if (true && false) {
            System.out.println(2);
        }
        String id = args[0];
        String password = args[1];
        if (id.equals("egoing") && password.equals("111")) {
            System.out.println("login success");
        } else {
            System.out.println("login fail");
        }
        if (true || true) {
            System.out.println('T');
        }
        if (true || false) {
            System.out.println("todi");
        }
        if (!true) {
            System.out.println("yes");
        }
    }
}
