package com.company;

public class Main {

    public static void main(String[] args) {
        int random = (int) (Math.random()*40-20);
        System.out.println(random);
        metod(3,4);
        int rand = (int)(Math.random()*101);
        if (rand<=9){
            System.out.println(rand+" "+1);
        }else if(rand>9){
            System.out.println(rand+" "+2);
        }
        else if(rand>99){
            System.out.println(rand+" "+3);
        }
    }
    public  static void  metod(int a,int b) {
        int X = (int) Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        int P = a+b+X;
        double d = 0.5*a*b;
        System.out.println("Площа " +d+ " Приметр "+P);
    }
}
