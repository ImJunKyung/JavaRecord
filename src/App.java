public class App {
    public static void main(String[] args) {
        Type type = new Type();
        int unicode = type.A;

        System.out.println("<정수형>");
        System.out.println("정수형 byte의 최대 크기 : " + type.b);
        System.out.println("정수형 short의 최대 크기 : " + type.s);
        System.out.println("정수형 int의 최대 크기 : " + type.i);
        System.out.println("정수형 long의 최대 크기 : " + type.l);
        System.out.print("\n");

        System.out.println("<문자형> (정수형에 속함)");
        System.out.println(type.A+"의 유니코드 값은 : " + unicode);
        System.out.print("\n");

        System.out.println("<실수형>");
        System.out.println("float " + type.f);
        System.out.println("double " + type.d);
        System.out.println("double이 float보다 표현할 수 있는 실수의 범위가 넓습니다.");
        System.out.print("\n");

        System.out.println("<논리형>");
        System.out.println("boolean yes : " + type.yes);
        System.out.println("boolean no : " + type.no);
        System.out.println("조건식의 결과에 사용된다.");
        System.out.print("\n");

        System.out.println("<String>");
        System.out.println("str에 할당된 문자열 : " + type.str);
        System.out.print("\n");
    }
}

