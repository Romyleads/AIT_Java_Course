package lesson_30.flyable;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

public class Airplane extends Transport implements Flyable{

    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    boolean takePassenger() {
      if (amountPassengers<capacity){
          amountPassengers++;
          return true;

      }
      return false;
    }

    @Override
    public void fly() {
        System.out.printf("Airplane flying");

    }
}
