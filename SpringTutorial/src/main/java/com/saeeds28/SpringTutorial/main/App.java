package com.saeeds28.SpringTutorial.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saeeds28.SpringTutorial.interfaces.Vehicle;
import com.saeeds28.SpringTutorial.pojos.Bike;
import com.saeeds28.SpringTutorial.pojos.Car;
import com.saeeds28.SpringTutorial.pojos.Tire;

/**
 * Hello world!
 *
 */
public class App  {
	
    public static void main( String[] args ) {
        ApplicationContext con = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Vehicle obj = con.getBean(Car.class);
        obj.drive();
        System.out.println(obj);
        
        Vehicle obj2 = con.getBean(Bike.class);
        obj2.drive();
        
        Tire t = con.getBean(Tire.class);
        System.out.println(t);
    }
}
