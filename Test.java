package iteratingArray;
import java.util.ArrayList;
import java.util.Collections;

public class Test{

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

            cars.add("Mustang");
            cars.add("Lamborghini");
            cars.add("Toyota");
            cars.add("Mitsubishi");
            cars.add("Corvette");
            cars.add("BMW");
            cars.add("Mercedes");
            cars.add("Audi");
            cars.add("Ford");
            cars.add("Tesla");

            Collections.sort(cars);

        for (String i : cars) {
            System.out.println(i);
        }

    }
}
