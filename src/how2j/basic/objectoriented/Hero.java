package how2j.basic.objectoriented;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    int killed;
    int kill;   //kill
    int support;    //助功
    int money;
    int lastHit;
    int attackSpeed;
    String wordAfterKill;
    String wordAfterKiller;

    void keng() {
        System.out.println("坑对友！");
    }

    float getArmor() {
        return armor;
    }

    void addSpeed(int speed) {
        moveSpeed = moveSpeed + speed;
    }

    void legendary() {
        System.out.println("你已经超神！");
    }

    float getHp() {
        return hp;
    }

    float recovery(float recoverHp) {
        return (hp + recoverHp);

    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "garen";
        garen.moveSpeed = 300;
        garen.hp = 1000;
        System.out.println(garen.name + "\t" + garen.moveSpeed);
        garen.addSpeed(500);
        System.out.println(garen.name + "\t" + garen.moveSpeed);
        System.out.println(garen.getHp());
        System.out.println(garen.recovery(200));

        garen.legendary();
        System.out.println(garen.getHp());
    }
}
