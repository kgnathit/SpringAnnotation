package com.Geeks.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext location= new AnnotationConfigApplicationContext(Location.class);
    	
    	CollegeInfo c1=location.getBean(CollegeInfo.class);
       //CollegeInfo c1=new CollegeInfo();
        c1.details();
    }
}
