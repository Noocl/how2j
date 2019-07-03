package how2j.basic.variable;

public class Integer {



    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 10;
        long l = 20;

        System.out.println(String.join("\t", b+"", s+"", i+"", l+""));

        Demo demo = new Demo();
        System.out.println(demo.by);
        System.out.println(demo.sh);
        System.out.println(demo.in);
        System.out.println(demo.lo);

    }
}

class Demo {
    byte by;
    short sh;
    int in;
    long lo;
}