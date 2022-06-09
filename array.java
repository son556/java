public class array {
    public static void main(String[] args){
        String[] classgroup = {"최진혁", "최유빈", "한이람", "이고잉"};//{}로 표현
        System.out.println(classgroup[0]);
        System.out.println(classgroup[1]);
        System.out.println(classgroup[2]);
        System.out.println(classgroup[3]);
        System.out.println(classgroup.length);

        String[] classg = new String[4];//문자를 원소로 갖고 크기가 4인 배열 생성
        System.out.println(classgroup.length);
        classg[0] = "why";
        System.out.println(classgroup.length);// 배열에 현재 몇개의 값이 있는지 알려주는게 아니라
         //////////////////////////////////////////// 배열이 몇개의 값을 수용가능한지 알려줌
        classg[1] = "so";
        System.out.println(classgroup.length);
        classg[2] = "serious";
        System.out.println(classgroup.length);
        classg[3] = "!?";
        System.out.println(classgroup.length);
        System.out.println(classg[0]);
        System.out.println("너의 샴푸향이 느껴진거야");
        String[] a_group = {"a", "b", "c", "d"};

        for (int i = 0; i < a_group.length; i++) {
            System.out.println(a_group[i]);
        }
        System.out.println("------------------for each-------------");
        for (String e : a_group) {// a_group의 각 원소를 e에 넣어줌
            System.out.println(e);
        }
    }
}
