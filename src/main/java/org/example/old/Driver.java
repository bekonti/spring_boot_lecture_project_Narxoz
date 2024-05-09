//package org.example;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Driver {
//    String name;
//    int age;
//    int experience;
//    String categories;
//    Taxi car;
//    List<Taxi> cars = new ArrayList<>();
//
//    public List<Taxi> getCars() {
//        return cars;
//    }
//
//    public void setCars(List<Taxi> cars) {
//        this.cars = cars;
//    }
//
//
//    public Driver() {
//    }
//
//    public Driver(String name, int age, int experience, String categories, Taxi car) {
//        this.name = name;
//        this.age = age;
//        this.experience = experience;
//        this.categories = categories;
//        setCar(car); // KISS, DRY
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getExperience() {
//        return experience;
//    }
//
//    public void setExperience(int experience) {
//        this.experience = experience;
//    }
//
//    public String getCategories() {
//        return categories;
//    }
//
//    public void setCategories(String categories) {
//        this.categories = categories;
//    }
//
//    public Taxi getCar() {
//        return car;
//    }
//
//
//    public void setCar(Taxi car) {
//        this.car = car;
//        cars.add(car);
//    }
//
//    @Override
//    public String toString() {
//        return "\nDriver{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", experience=" + experience +
//                ", categories='" + categories + '\'' +
//                ", \n  current Car = " + car +
//                ", \n    old cars = " + cars +
//                '}';
//    }
//}
