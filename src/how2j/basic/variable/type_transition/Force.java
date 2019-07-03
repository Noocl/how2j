package how2j.basic.variable.type_transition;

public class Force {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 1000;

        byte b1 = (byte) i1;
        byte b2 = (byte) i2;

        System.out.println(b1);
        System.out.println(b2);
    }
}
