//package org.example;
//
//import static org.example.Main.id;
//
//public class Taxi {
//    private int number;
//    private String name;
//    private String type;
//
//    @Override
//    public String toString() {
//        return "Taxi{" +
//                "number=" + number +
//                ", name='" + name + '\'' +
//                ", type='" + type + '\'' +
//                "} " + Integer.toHexString(hashCode()) + " ! ";
//    }
//
//    public Taxi() {
//        number = id++;
//        name = "Camry";
//        type = "comfort+";
//    }
//
//    public Taxi(int number, String name, String type) {
//        this.number = number;
//        this.name = name;
//        this.type = type;
//    }
//
//    public int getNumber() {
//        return number;
//    }
//
//    public void setNumber(int number) {
//        this.number = number;
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
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//}
