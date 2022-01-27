package Polymorphism;

public class Polymophism {
    public static class Polymorphism {
        public static void main(String[]args) {

            Dog dog = new Dog();
            Cat cat = new Cat();
            Snake snake = new Snake();

            Pets[] sounds = {dog, cat, snake};
            for (Pets x : sounds) {
                x.noise();

            }
        }}}