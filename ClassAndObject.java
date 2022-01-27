package ClassAndObject;

public class ClassAndObject {
    public static void main(String[]args){
        MyCar DreamCar = new MyCar();
        System.out.println(DreamCar.make);
        System.out.println(DreamCar.model);
        System.out.println(DreamCar.year);
        System.out.println(DreamCar.price);
        DreamCar.fast();
        DreamCar.slow();
    }}

class MyCar {
    String make = "Ferrari";
    String model = "812 Superfast";
    int year = 2020;
    int price = 98555;
    void fast() {
        System.out.println("Come on, lets get to 140 miles and hour. YEAHHH");}
    void slow(){
        System.out.println("Ohh NOO!! Police, slow down");
    }}