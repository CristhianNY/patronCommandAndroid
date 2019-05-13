package com.cristhian.com.patroncommand;

import android.content.Context;

import java.util.HashMap;
import java.util.Map;

public class Invoker{

    private Map<String, Command> orden;



    public Invoker(){

        this.orden =  new HashMap<>();


    }

    public void add (Command command , String key){
        this.orden.put(key,command);
    }

    public void execute(String key , Context c){

        if (orden.get(key)!=null){

            this.orden.get(key).execute(c);
        }


    }

}