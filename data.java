public class data {
    public static void main(String[] args){
        //명시적 형변환
        int alpha = (int)100.1f; // (int)해주면 정수형으로 형변환 이때 소수점 밑으로 버림
        float beta = (float)100.1; // (float)으로 형변환
        int result = 1+2;
        System.out.println(result);
        result = result - 1;
        System.out.println(result);
        result = result * 2;
        System.out.println(result);
        result = result / 2;
        System.out.println(result);
        result = (result + 1) % 2;
        System.out.println(result);

        String firststring = "This is ";
        String secondstring = "a concatenated string.";
        String thirdstring = firststring + secondstring;
        System.out.println(thirdstring);

        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a/b);// a/b => 3.3333...이나 a와 b가 둘다 정수 이기 때문에 소수점 뒤 값들은 누락
        System.out.println(c/d);// c/d 는 실수/실수 이므로 3.3333... 이 손실 없이 나옴
        System.out.println(a/d);// a/d -> 정수/실수의 경우 정수가 실수로 형변환이 되어 3.333...이 손실없이 나옴

        int dd = (3+7)/7;
        System.out.println(dd);// 이 경우도 System.out.println(a/b)의 경우와 같다.
        System.out.println("-----------------------------------------------------");
        int i = 3;
        i++; // i = i + 1
        System.out.println(i);//4
        ++i;
        System.out.println(i);//5
        System.out.println(++i);//6
        System.out.println(i++);//6 --> i++ 에서 +1이 되는 것이 아니라 i++가 끝나야 +1이 반영됨
        System.out.println(i);//7
        System.out.println(++i);// ++i 에서 +1이 반영
        System.out.println(++i);
        System.out.println(i);
    }
}
