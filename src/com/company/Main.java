package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//    Fish fish= new Fish();
//    fish.setAgeFish(scanner.nextInt());
//        System.out.println("age of fish: "+fish.getAgeFish());
//    fish.setTypeFish(scanner.next());
//        System.out.println("type of fish: "+fish.getTypeFish());
//    fish.setPlaceLifeFish(scanner.next());
//        System.out.println("the place life of fish: "+fish.getPlaceLifeFish());

//    Parrot parrot = new Parrot();
//    parrot.setNameParrot(scanner.next());
//        System.out.println("the name of parrot:"+ parrot.getNameParrot());
//    parrot.setPlaceLifeParrot(scanner.next());
//        System.out.println("the place of life parrot: "+parrot.getPlaceLifeParrot());
//    parrot.setAgeParrot(scanner.nextInt());
//        System.out.println("age of parrot: "+parrot.getAgeParrot());

//        Cat cat= new Cat();
//        cat.setNameCat(scanner.next());
//        System.out.println("the name of cat: " + cat.getNameCat());
//        cat.setAgeCat(scanner.nextInt());
//        System.out.println("age of cat: " + cat.getAgeCat());
//        cat.setBreedCat(scanner.next());
//        System.out.println("the breed of cat: " + cat.getBreedCat());

    Dog dog = new Dog();
    dog.setNameDog(scanner.next());
        System.out.println("the name of dog: " + dog.getNameDog());
    dog.setAgeDog(scanner.nextInt());
        System.out.println("age of the dog: " + dog.getAgeDog());
    dog.setBreedOfDog(scanner.next());
        System.out.println("the breed of dog: "+ dog.getBreedOfDog());
    }
}
