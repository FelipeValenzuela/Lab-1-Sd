/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg1.sistemas.distribuidos;

import java.util.*;

public class Eliminar {
    public static void main(String [] arg){
        Scanner n= new Scanner (System.in);
        int t[]= new int[10];
        int posicion;
        //leemos los 10 numeros
       
        for (int i=0;i<10;i++){
            System.out.println("Elemento i" + i+ "): ");
            t [i] = n.nextInt();
        }
        System.out.println();
        //Leemos la posicion que nos interesa
        //Suponemos que la posicion esta en el rango 0..9
        
        System.out.println("Posicion a eliminar:");
        posicion = n.nextInt();
        
        //Desplazamos desde posicion hasta el final de todos los elementos un
        //hacia la izquierda con lo que la posicion se borra
        
        for (int i=posicion; i<9; i++){
            // la i llega hasta la penultima posicion
            t [i] = t [i+1];
        }   
        System.out.println("La tabla queda:");
        for (int i=0;i<9; i++){
              System.out.println(t[i]);
        }
          
    }
}

