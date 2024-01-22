package org.example.creational.builder;

public class Main {
    public static void main(String[] args) {
       /* Car car = new Car();
        car.setBrand("Alfa Romeo");
        car.setModel("xxx");
        car.setYear(2023);


        Car car2 = new Car("Alfa Romeo", "XX", 2023, "Kırmızı",500);
        */

        Car car1 = new Car.Builder().brand("Alfa Romeo").color("Kırmızı").horsePower(500).year(2023).build();
        car1.setBrand("BMW");
        System.out.println(car1.toString());
    }
}
