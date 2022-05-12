package com.company;

public class Parrot {
    private String nameParrot;
    private String placeLifeParrot;
    private int ageParrot;

    void setNameParrot(String a){
        nameParrot=a;
        if(a.isEmpty()){
            System.out.println("error, you forgot enter name of parrot");
        }
    }
    String getNameParrot(){
        return nameParrot;
    }

    void setPlaceLifeParrot(String a){
        placeLifeParrot=a;
        if (a.isEmpty()){
            System.out.println("error, you forgot enter place life of parrot");
        }
    }
    String getPlaceLifeParrot(){
        return placeLifeParrot;
    }

    void setAgeParrot(int b){
        ageParrot=b;
        if (b>0&&b<30){
            this.ageParrot=b;
        }else{
            System.out.println("parrot can not be this age!");
        }
    }
    int getAgeParrot(){
        return ageParrot;
    }
}
