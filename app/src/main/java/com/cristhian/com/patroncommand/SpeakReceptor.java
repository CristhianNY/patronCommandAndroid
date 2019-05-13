package com.cristhian.com.patroncommand;

import android.content.Context;

public class SpeakReceptor {

    public boolean sayHello(Context c){

        System.out.println("Hablando");

        try{

            System.out.println("Hola");

            return true;

        }catch(Exception e){

            System.out.println("No se ha podido establecer la conexión al sistema de iluminación. ERROR:n"+e.getMessage());

            return false;

        }

    }
    public boolean sayBye(Context c){

        System.out.println("Hablando");

        try{

            System.out.println("Bye");

            return true;

        }catch(Exception e){

            System.out.println("No se ha podido establecer la conexión al sistema de iluminación. ERROR:n"+e.getMessage());

            return false;

        }

    }

}