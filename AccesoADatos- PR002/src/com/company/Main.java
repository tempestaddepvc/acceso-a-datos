package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File dir = new File("directorio");
        File file1=new File("directorio\\nombresincambiar.txt");
        File file2=new File("directorio\\archivoadestruir.txt");
        File file3=new File("directorio\\aMiNoMePasaNada.txt");
        File subdir=new File("directorio\\subdirectorio");
        File subfile1=new File("directorio\\subdirectorio\\archivodelsubdirectorio");
        dir.mkdir();
        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();
        file2.delete();
        file1.renameTo(new File("directorio\\nombrecambiado.txt"));
        subdir.mkdir();
        subfile1.createNewFile();
        mostrarContenidos(dir.list());

        mostrarContenidos(subdir.list());


    }
    private static void mostrarContenidos(String[] auxiliar){
        for(int i=0;i<auxiliar.length;i++){
            System.out.println(auxiliar[i]);
        }
    }
}
