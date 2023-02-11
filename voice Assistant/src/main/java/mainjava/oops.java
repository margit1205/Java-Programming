package mainjava;

import inheritance.inheritclass;
import abstraction.abstractclass;
import constructor.constructor;
import encapsulation.encapsuclass;
import polymorphism.polymorclass;

import java.util.Scanner;



public class oops {

  Scanner scan = new Scanner(System.in);
    public static void main(String[] args){




   Childclass obj1=new Childclass();
   obj1.getdetails();
   obj1.childfunction(obj1.secret);
   obj1.response();




   abstractclass abstr=new abstractclass();



   encapsuclass encap=new encapsuclass();
   encap.setRespnsetime(30);
   encap.setNameofassistant("Alexa");
   System.out.println("Name of encapsulated assitant is  "+encap.getNameofassistant());
   System.out.println("Response time of assitant is  "+encap.getrespnsetime());



   polymorclass poly=new polymorclass();


   System.out.println("The addition of given two number is "+poly.Adding(2,3));
   System.out.println("The addition of given two number is "+poly.Adding(2,3,4));



   constructor call=new  constructor();


    }
}