//First non repeating character in a string
import java.util.*;
class HelloWorld {
    public static void main(String[] args){
        String str="hello";
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for(char i:str.toCharArray()){
            if(h.containsKey(i)){
                h.put(i,h.get(i)+1);
            }
            else
            {
                h.put(i,1);
            }
        }
        for(Map.Entry<Character,Integer> entry:h.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey());
                break;
            }
        }
    }
}

/*another way
String str="hello";
        for(char i:str.toCharArray()){
            if(str.indexOf(i)==str.lastIndexOf(i)){
                System.out.print(i);
                break;
            }
        }
        */
