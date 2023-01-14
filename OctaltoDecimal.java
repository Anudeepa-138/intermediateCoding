class OctaltoDecimal {
    static int toDecimal(long num)
    {
        int i=0,dec=0;
        int base=8;
        while(num!=0)
        {
            long r = num%10;
            dec+=r*(int)Math.pow(base,i);
            num=num/10;
            i++;
        }
        return dec;
    }
    public static void main(String[] args) {
        long num = 71412;
        System.out.println(toDecimal(num));
    }
}
/*import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String octal = "71412";
        int base = 8;
        
        System.out.println(Integer.parseInt(octal,base));
    }
}*/