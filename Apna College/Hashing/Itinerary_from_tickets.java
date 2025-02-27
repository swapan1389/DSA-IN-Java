
// "Chennai" -> "Bengaluru"
// "Mumbai" -> "Delhi"
// "Goa" -> "Chennai"
// "Delhi" -> "GOa"

// "Mumbai"->"Delhi"->"Goa"->"Chennai"->"Bengaluru"

import java.util.HashMap;
import java.util.Map;

public class Itinerary_from_tickets {
    public static void main(String[] args) {
        HashMap<String,String> ticketMap=new HashMap<>();
        ticketMap.put("Chennai","Bengaluru");
        ticketMap.put("Mumbai","Delhi");
        ticketMap.put("Goa","Chennai");
        ticketMap.put("Delhi","Goa");

        // As Values are unique here so we can create reverse HashMap
        HashMap<String,String> reverse_ticketMap=new HashMap<>();
        for(Map.Entry<String,String> entry:ticketMap.entrySet()){
            reverse_ticketMap.put(entry.getValue(),entry.getKey());
        }

        String start="";

        // finding the start city which is not present in reverse map means there is no incoming route
        for(String from:ticketMap.keySet()){
            if(!reverse_ticketMap.containsKey(from)){
                start=from;
                break;
            }
        }

        while(ticketMap.containsKey(start)){
            System.out.print(start+"->");
            start=ticketMap.get(start);

        }
        System.out.print(start);






    }

    
}