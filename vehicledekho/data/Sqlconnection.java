package com.vehicledekho.data;
import java.sql.*;
import java.util.*;


public class Sqlconnection{  
    public static String password="Dataloss@123";
    public static String username="root";
    public static String url="jdbc:mysql://localhost:3306/mydatabase";
public static List<Car> fromDatabase() throws SQLException{
    List<Car> cars=new ArrayList<>(); 
    try{    
        Connection con = DriverManager.getConnection(url,username,password);
        Statement stmt=con.createStatement();  
        ResultSet resultSet = stmt.executeQuery("SELECT * FROM `mydatabase`.`vehicle`");

        while (resultSet.next()) {
        int id = resultSet.getInt("id");
        String brand = resultSet.getString("brand");
        String category = resultSet.getString("category");
        int mileage = resultSet.getInt("mileage");
        int price = resultSet.getInt("price");
        cars.add(new Car(id, brand, category, mileage, price));
    }
    con.close();  
}
catch(Exception e){
    }  
          return cars;                                
        }  
        
        

        public static void toDatabase(List<Car> cars) {

            try {
                Connection con = DriverManager.getConnection(url, username, password);
                Statement statement = con.createStatement();
                for (Car car : cars) {
                    String Query = String.format(
                            "INSERT INTO `mydatabase`.`vehicle` (`id`, `brand`, `category`, `mileage`,`price`) VALUES (%d, '%s', '%s', %d, %d)",
                            car.getId(),car.getBrand(), car.getCategory(), car.getMileage(),car.getPrice());
                    statement.executeUpdate(Query);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
    }