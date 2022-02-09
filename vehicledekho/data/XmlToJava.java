package com.vehicledekho.data;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import com.vehicledekho.Cars;

import java.io.*;
import java.util.*;



public class XmlToJava {
	public static List<Car> getCar(){
       
        try {
            File file=new File("C:\\Users\\Parth\\eclipse-workspace\\vehicledekho.com\\src\\com\\vehicledekho\\XmlToJava\\vehicledekho\\src\\com\\Car.xml");
        	JAXBContext jaxbContext = JAXBContext.newInstance(Cars.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Cars cars = (Cars) unmarshaller.unmarshal(file);
            List<Car> carList=cars.getCars();
            return carList;

        }catch(JAXBException e){
            System.out.println(e);
        }
        return null;
    }
}
