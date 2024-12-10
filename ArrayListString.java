import java.util.ArrayList;

public class ArrayListString {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add(3, "Maruti");
    cars.add(0, "Socoda");
    
    cars.size();
    System.out.println(cars);
  }
}
