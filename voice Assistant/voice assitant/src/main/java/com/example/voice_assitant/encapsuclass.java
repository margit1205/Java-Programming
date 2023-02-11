package com.example.voice_assitant;

public class encapsuclass {
    private String nameofassistant;
    private int respnsetime;

    public int getrespnsetime(){
        return respnsetime;
    }
    public String getNameofassistant(){
        return nameofassistant;
    }



    public void  setRespnsetime(int newtime){
        respnsetime=newtime;
    }
    public void  setNameofassistant(String newname){
        nameofassistant=newname;
    }
}
