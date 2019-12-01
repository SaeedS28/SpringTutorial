package com.saeeds28.SpringTutorial.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saeeds28.SpringTutorial.interfaces.Vehicle;
import com.saeeds28.SpringTutorial.pojos.Car;

/**
 * Hello world!
 *
 */
public class App  {
	
    public static void main( String[] args ) {
        ApplicationContext con = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Vehicle obj = con.getBean(Car.class);
        obj.drive();
    }
}
