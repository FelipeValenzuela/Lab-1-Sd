/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg1.sistemas.distribuidos;

/**
 *
 * @author Felipe Valenzuela
 */
public class Lista {
    Nodo inicio;
    int tamaño;
    
    
    public boolean agregar (double dato){
        if (inicio == null){
            inicio = new Nodo(null,dato, null, 0);
            tamaño ++;
            return true;
        }
        else{
            Nodo temp= inicio;
            while (temp.tieneSiguiente ()){
                temp=temp.getSiguiente();
            }
            temp.setSiguiente(new Nodo(null,dato, null, 0));
            tamaño++;
            return true;            
        }
    } 
    
    
   public void eliminar (double dato){
       {
           
       }
   
   }
}

