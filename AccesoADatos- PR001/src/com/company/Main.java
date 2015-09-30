package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String ruta;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Introduzca la ruta del fichero");
        ruta= keyboard.nextLine();
        keyboard.close();
        File fichero=new File(ruta);
        if(fichero.exists()){
            System.out.println("Nombre: " + fichero.getName());
            System.out.println("Ejecutable:" + fichero.canExecute());
            System.out.println("Oculto:" + fichero.isHidden());
            System.out.println("Ruta relativa:" + fichero.getPath());
            System.out.println("Ruta absoluta:" + fichero.getAbsolutePath());
            System.out.println("Tamaño:" + fichero.length());
        }else{
            System.out.println("'El fichero especificado no existe!");
        }
    }
}
