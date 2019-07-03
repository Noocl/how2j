package how2j.basic.variable.type_transition;

public class Rule {
    public static void main(String[] args) {
        char c ='c';
        short s = 60;

        short s1 = (short) c;
        char c1 = (char) s;

        System.out.println(c);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(c1);
    }
}
