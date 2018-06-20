package hoangAnh;

import java.util.Scanner;

public class StringDemo {

    int num1;
    boolean boo1;
    long long1;
    double double1;
    float float1;
    char char1;

    public void primitiveVsObject(){

        // Primitive Variables
        num1 = 1;

        // Object Variables
        Car car1 = new Car("Toyota","Camry");
        String sentence = "My name is Duc Anh";


        Scanner scan = new Scanner(sentence);

    }

    public static void main(String[] args) {

        // How to use scanner
        String sentence = "My name is Duc Anh";

        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine();
        System.out.println(string1.toLowerCase());


    }


    public static int sum(int a, int b){
        return a+b;
    }

}
