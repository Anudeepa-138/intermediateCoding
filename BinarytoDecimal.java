class BinarytoDecimal {
    static int toDecimal(long num)
    {
        int i=0,dec=0;
        while(num!=0)
        {
            long r = num%10;
            dec+=r*(int)Math.pow(2,i);
            num=num/10;
            i++;
        }
        return dec;
    }
    public static void main(String[] args) {
        long num = 101;
        System.out.println(toDecimal(num));
    }
}
