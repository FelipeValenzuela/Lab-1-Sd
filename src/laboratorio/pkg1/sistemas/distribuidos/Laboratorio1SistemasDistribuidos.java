package laboratorio.pkg1.sistemas.distribuidos;

/**
 *
 * @author Felipe Valenzuela
 */
public class Laboratorio1SistemasDistribuidos {

       
    public static void main(String[] args) {
        
        int total_hits = 0, total_miss = 0;
        Cache lru_cache = new Cache(5);
        String my_queries[] = {"query 2", "query 6", "query 5", "query 2", "query 3", "query 6", "query 6", "query 12","query 2", "query 15", "query 19", "query 10", "query 15"};
            for (int i = 0; i < my_queries.length; i++) {
            System.out.println("Query: '" + my_queries[i] + "'");
            String result = lru_cache.obtenerpalabra(my_queries[i]);
            if (result == null) { 
                System.out.println("La consulta no esta en la cache");
                total_miss++;
                result = Index.getEntry(my_queries[i]);
                lru_cache.agregarpalabra(my_queries[i], result);
            }else{
                System.out.println("Consulta encontrada");
                total_hits++;
            }
        
        lru_cache.imprimirpalabra();
        System.out.println("");
        int total = total_hits + total_miss;
        float percentage_hits = (100 * total_hits) / total;
        float percentage_miss = (100 * total_miss) / total;
        System.out.println("Total queries: " + total);
        System.out.println("Hits: " + total_hits + " ("+ percentage_hits +"%)");
        System.out.println("Miss: " + total_miss + " ("+ percentage_miss +"%)");
        }         
    }
}
       

