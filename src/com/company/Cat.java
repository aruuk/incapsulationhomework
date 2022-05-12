package com.company;

public class Cat {
    private String nameCat;
    private int ageCat;
    private String breedCat;

    void setNameCat(String a){
        nameCat=a;
        if (a.isEmpty()){
            System.out.println("error, you forgot enter name of cat");
        }
    }
    String getNameCat(){
       return nameCat;
    }

    void setAgeCat(int b){
        ageCat=b;
        if (b>0 && b<15){
            this.ageCat=b;
        }else{
            System.out.println("error, cat can not be this age!");
        }
    }
    int getAgeCat(){
        return ageCat;
    }

    void setBreedCat(String c){
        breedCat=c;
        if (c.isEmpty()){
            System.out.println("error,you forgot enter breed of cat");
        }
    }
    String getBreedCat(){
        return breedCat;
    }
}
