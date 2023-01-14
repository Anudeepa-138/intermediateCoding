import java.util.*;
class CountingElements {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,2,5,6,3,3,4};
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(h.containsKey(arr[i]))
            {
                h.put(arr[i],h.get(arr[i])+1);
            }
            else
            {
                h.put(arr[i],1);
            }
        }
        System.out.println(h);
    }
}
