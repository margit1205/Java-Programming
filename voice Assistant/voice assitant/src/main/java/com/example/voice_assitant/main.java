package com.example.voice_assitant;

import java.util.Scanner;



public class main {

  Scanner scan = new Scanner(System.in);

    public static void main(String[] args){






   Childclass obj1=new Childclass();
   obj1.getdetails();
   obj1.childfunction(obj1.secret);
   obj1.response();









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