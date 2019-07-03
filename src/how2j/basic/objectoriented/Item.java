package how2j.basic.objectoriented;

public class Item {
    String name;
    float price;

    public static void main(String[] args) {
        Item potion = new Item();
        potion.name = "血瓶";
        potion.price = 50;

        Item shoe = new Item();
        shoe.name = "草鞋";
        shoe.price = 300;

        Item sword = new Item();
        sword.name = "长剑";
        sword.price = 350;

        System.out.println(potion.name + "\t" + potion.price);
        System.out.println(String.join("\t", shoe.name, shoe.price+""));
        System.out.println(sword.name + "\t" + sword.price);
    }
}
