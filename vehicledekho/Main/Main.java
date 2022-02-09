package com.vehicledekho.Main;
import com.vehicledekho.data.*;
import java.util.*;
import java.sql.*;

public class Main{
        public static void main(String[] args) throws SQLException  {
        List<Car> cars = XmlToJava.getCar();
        Sqlconnection.toDatabase(cars);
        List<Car> carList = Sqlconnection.fromDatabase();
        for(Car car : carList) {
            System.out.println(car.getBrand());

	}
}



}
