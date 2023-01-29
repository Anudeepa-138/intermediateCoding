import java.util.*;
class HelloWorld {
    public static void main(String[] args){
        String str="hello";
        ArrayList<String>a = new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            String st="";
            for(int j=0;j<=i;j++)
            {
                st+=str.charAt(j);
            }
            a.add(st);
        }
        System.out.print(a);
        
    }
}
//using recursion
