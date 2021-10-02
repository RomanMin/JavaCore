package Lesson03;

import java.util.ArrayList;

public class Box<F> {

    ArrayList fruits = new ArrayList();
    private double weightFruit;

    public  Box(double weightFruit) {
        this.weightFruit = weightFruit;
    }
    public void putInBox(F fruit) {
        fruits.add(fruit);
    }

    public double getWeightFruit() {

        return fruits.size()*weightFruit;
    }

   public boolean compare (Box<?> box) {
        return Math.abs(getWeightFruit() - box.getWeightFruit()) < 0.00001;

   }
   public  void putInBox(Box<F> box) {
       System.out.println("Ящик1 с яблоками: " + fruits.size());
       System.out.println("Ящик2 с яблоками: " + box.fruits.size());
       fruits.addAll(box.fruits);
       box.fruits.clear();
        box.fruits.trimToSize();
       System.out.println("Ящик1 с яблоками после: " + fruits.size());
       System.out.println("Ящик2 с яблоками после: " + box.fruits.size());
   }
}
