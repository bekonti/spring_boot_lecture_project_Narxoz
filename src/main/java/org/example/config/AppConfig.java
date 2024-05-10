//package org.example.config;
//
//import org.example.Driver;
//import org.example.Taxi;
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//
//import static org.example.Main.id;
//
//@Configuration
//public class AppConfig {
//    @Bean(value = "CamryTaxi")
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//    Taxi creatTaxi() {
//        return new Taxi();
//    }
//
//    @Bean(name = "teslaBean")
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    Taxi creatElectroTaxi() {
//        return new Taxi(id++, "Tesla", "Business");
//    }
//
//    @Bean("Rusik")
//    Driver rusikKolesa(){
//        Driver ruslan = new Driver(
//                "Ruslan",
//                30,
//                14,
//                "B,B1,C,D,E",
//                creatTaxi());
//
////        ruslan.setCar(creatTaxi());
//
//        return ruslan;
//
//    }
//
//
//}
