package hoangAnh;

public class Car {

    String brand;
    String model;

    // construction method
    public Car(String brandName, String modelName){
        brand = brandName;
        model = modelName;
    }

    public void run(){
        System.out.println("Vroom Vroom....Vroom Vroom");
    }

}
