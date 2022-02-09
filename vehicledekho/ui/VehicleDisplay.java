package com.vehicledekho.ui;
import com.vehicledekho.data.*;
import java.util.List;
 
public class VehicleDisplay {
    public static void displaycar(List<Car> cars) {
        for (Car car: cars) {
            System.out.println("Id: " + car.getId());
            System.out.println("Brand: " + car.getBrand());
            System.out.println("Name: " + car.getCategory());
            System.out.println("MaxSpeed: " + car.getMileage());
            System.out.println("Price: " + car.getPrice());

        }
    }
}
