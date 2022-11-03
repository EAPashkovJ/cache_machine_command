package maitain;

import java.util.*;

public class Carrency {
    private Map<Integer, Integer> valuteDenom = new HashMap<>();


    public void addCurrency(int denomination, int count){
        if(valuteDenom.containsKey(denomination)){
            valuteDenom.put(denomination, valuteDenom.get(denomination)+count);

        }else {
            valuteDenom.put(denomination, count);
        }
    }

    public int getCheck(){
        int sum =0;
        for(Map.Entry<Integer,Integer> check : valuteDenom.entrySet()){
            sum +=  check.getKey() * check.getValue();
        }
        return sum;
    }
    public Map<Integer, Integer> withdrawCheck(int expectedAmount){
        int sum = expectedAmount;

        Map<Integer, Integer> valuteDenomCopy = new HashMap<>(valuteDenom);
        List<Integer> keys = new ArrayList<>(valuteDenom.keySet());
        Collections.sort(keys);
        Collections.reverse(keys);
        Map<Integer, Integer> result = new TreeMap<>(Comparator.reverseOrder());
        for(Integer denom : keys){
            int key = denom;
            int value = valuteDenomCopy.get(key);
            while (true){
                if(sum < key || value == 0){
                    valuteDenomCopy.put(key,value);
                    break;
                }
                sum -= key;
                value--;
                if(result.containsKey(key))
                    result.put(key, result.get(key) +1);
                else result.put(key,1);
            }
        }
        if(sum > 0)
            ConsoleOutput.writeString("Недостаточно средств");
        else  valuteDenom = valuteDenomCopy;
        return  result;
    }

    public boolean hasCurrency(){
        return !valuteDenom.isEmpty();
    }

}
