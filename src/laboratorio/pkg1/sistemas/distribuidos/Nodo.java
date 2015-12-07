
package laboratorio.pkg1.sistemas.distribuidos;

/**
 *
 * @author Felipe Valenzuela
 */
public class Nodo {
    
    private Nodo siguiente;
    private double dato;
    private String query;
    private int hit;
    
    public Nodo (){
    }
    
    public Nodo (Nodo siguiente, double dato, String query, int hit){
        this.siguiente = siguiente;
        this.dato = dato; 
        this.query= query;
        this.hit= hit;        
    }
    
    public int edithit (){
        this.hit = this.hit +1;
        return this.hit;
    }
            
    public Nodo getSiguiente (){
        return siguiente;
    }
    
    public void setSiguiente (Nodo siguiente){
        this.siguiente = siguiente;
    }
    
    public double getDato(){
        return dato;
    }
    
    public void setDato(double dato){
        this.dato = dato;
    }
    
    public boolean tieneSiguiente(){
        return siguiente !=null ;
    }    
    
}
