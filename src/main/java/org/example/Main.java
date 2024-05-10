package org.example;

//import org.example.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

//    public static int id = 3;
//
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(AppConfig.class);
//
//        Taxi car = (Taxi) context.getBean("CamryTaxi");
//        System.out.println(car);
//
//        Taxi teslaCar = (Taxi) context.getBean("teslaBean");
//        System.out.println(teslaCar);
//
//        Taxi teslaCar2 = (Taxi) context.getBean("teslaBean");
//        System.out.println(teslaCar2);
//
//        Driver ctxDriver = (Driver) context.getBean("Rusik");
//        System.out.println(ctxDriver);
//
//        ctxDriver.setCar(teslaCar);
//        ctxDriver.setCar(teslaCar2);
//        System.out.println(ctxDriver);

//    }
}