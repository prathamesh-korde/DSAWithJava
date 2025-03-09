
import java.util.HashMap;

/*FIND ITINERARY FROM TICKETS
WE HAVE GIVEN A hashmap for contains from(key) and to(value) we have to find the longest path by whic we able to travel
approach-
1.find start(key conatins bue value not contain 
2.*/
public class J_127ItineraryTickets{
    public static String start(HashMap<String , String> ticket){
        for(String val : ticket.keySet()){
            if(!ticket.containsValue(val)){
                return val;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String , String> tickets = new HashMap<>();
        tickets.put("Chennai", "Banguluru");
        tickets.put("Mumbia", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
       String str= start(tickets);
       System.out.print("start"+"-->");
       while(tickets.containsKey(str)){
        System.out.print(str+"-->");
        str=tickets.get(str);
       }
       System.out.print("End");
    }
}