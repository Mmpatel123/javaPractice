package Practicepackages;

import Class9HwPT1.Animal;

class animal {
     public void eat() {
         System.out.println("human can eat");
     }


   public static  class pup extends animal{
         public void bark(){
             System.out.println("jini is a fat girl");
         }
     }


     public static void main(String[] args) {
animal no= new animal();
no.eat();
pup nos= new pup();
nos.bark();
     } }