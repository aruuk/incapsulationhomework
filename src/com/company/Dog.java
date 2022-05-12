package com.company;

public class Dog {
    private String nameDog;
    private int ageDog;
    private String breedOfDog;

    void setNameDog(String a) {
        nameDog = a;
        if (a.isEmpty()) {
            System.out.println("error, you forgot enter  name of dog!");
        }
    }
    String getNameDog() {
        return nameDog;
    }

    void setAgeDog(int b) {
        ageDog = b;
        if (b < 0 || b > 14) {
            System.out.println("error,dog can not be this age!");
        }else{
            this.ageDog = b;
        }
    }
    int getAgeDog(){
        return ageDog;
    }

    void setBreedOfDog(String c){
        breedOfDog=c;
        if (c.isEmpty()){
            System.out.println("error, you forgot enter breed of dog!");
        }
    }
    String getBreedOfDog(){
        return breedOfDog;
    }
}
