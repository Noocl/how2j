package how2j.basic.variable.literral;

public class Practice {
    public static void main(String[] args) {
        // 定义如下变量，然后为每种不同类型的变量赋予合法的字面值
        byte b = 0b1010;
        short s = 012;
        int i = 10;
        long l = 0xef;
        float f = 0.0314E2F;
        double d = 234E200D;
        char c = '\t';
        String str = "hello";

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(str);
    }
}
