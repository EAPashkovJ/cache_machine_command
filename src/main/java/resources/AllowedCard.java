package resources;

import java.util.HashMap;
import java.util.Map;

/**
 * List of cards services in bank
 * implementation on Map<String,String>
 */
public class AllowedCard {

   public Map<String, String> BaseOfCards(){

       Map<String,String> cardHolder = new HashMap<>();

       cardHolder.put("5555444433332222","5555" );
       cardHolder.put("1234567891233342", "1234");
       cardHolder.put("5678910111213145", "4321");

       return cardHolder;
   }
}

