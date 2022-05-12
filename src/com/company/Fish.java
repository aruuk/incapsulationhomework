package com.company;

import java.util.Scanner;

public class Fish {
    private String placeLifeFish; //какой именно водоем,океан,море
    private String typeFish; //вид рыбы
    private int ageFish;


    void setTypeFish(String a){
        typeFish=a;
        if (typeFish.isEmpty()) {
            System.out.println("error,you forgot enter type of fish!");
        }
    }
    String getTypeFish(){
        return typeFish;
    }

    void setAgeFish(int i){
        ageFish=i;
        if (i>0 && i<50){
            this.ageFish=i;
        }else{
            System.out.println("fish can not be this age!");
        }
    }
    int getAgeFish(){
        return ageFish;
    }

    void setPlaceLifeFish(String b){
        placeLifeFish=b;
        if (placeLifeFish.isEmpty()){
            System.out.println("error,you forgot enter place Life of fish!");
        }
    }
    String getPlaceLifeFish(){
        return placeLifeFish;
    }
}
