package laboratorio.pkg1.sistemas.distribuidos;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Cache {
    int size;
    LinkedHashMap<String, String> cache;
    
    public Cache(int size) {
        this.size = size;
        this.cache = new LinkedHashMap<>();
    }

    public String obtenerpalabra(String query) {
        String result = cache.get(query);
        if(result != null) {       
            cache.remove(query);
            cache.put(query, result);
        }
        return result;
    }
        
    public void agregarpalabra(String query, String answer) {
        if (cache.containsKey(query)) { // HIT
            // Bring to front
            cache.remove(query);
            cache.put(query, answer);
        } else { // MISS
            if(cache.size() == this.size) {      
                String first_element = cache.entrySet().iterator().next().getKey();
                System.out.println("Removiendo: '" + first_element + "'");
                cache.remove(first_element);
            }
            cache.put(query, answer);
        }
    }
    
    public void imprimirpalabra() {
        System.out.println("===== La Cache actual es =====");
        System.out.println("| " + String.join(" | ", cache.keySet()) + " | ");
        System.out.println("==============================");
    }

}
