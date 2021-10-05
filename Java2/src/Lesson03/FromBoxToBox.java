package Lesson03;
import java.util.Arrays;
public class FromBoxToBox {
    public static void main(String[] args) {
        fruitsToBox();
    }
    public static void fruitsToBox() {
        Box<Apple> appleBox1 = new Box<Apple>(1);
        Box<Orange> orangeBox1 = new Box<Orange>(1.5);
        Box<Apple> appleBox2 = new Box<Apple>(1);

        for (int i = 0 ; i < 3; i++ ) {
            orangeBox1.putInBox(new Orange());
            appleBox1.putInBox(new Apple());
            appleBox2.putInBox(new Apple());
        }
        appleBox1.putInBox(new Apple());
        appleBox1.putInBox(new Apple());
        appleBox2.putInBox(new Apple());

        System.out.println("Вес ящика1 с яблоками: " + appleBox1.getWeightFruit());
        System.out.println("Вес ящика2 с яблоками: " + appleBox2.getWeightFruit());
        System.out.println("Вес ящика с апельсинами: " + orangeBox1.getWeightFruit());
        System.out.println("Сравним ящики по содержимому: " + appleBox1.compare(orangeBox1));
        System.out.println("_________________________________________________________");
        appleBox1.putInBox(appleBox2);
    }
}
