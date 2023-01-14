class HexadecimaltoDecimal {
    public static int toDecimal(String hex)
    {
        int len=hex.length();
        int j=0,dec=0;
        for(int i=len-1;i>=0;i--)
        {
            if(hex.charAt(i)>='0' && hex.charAt(i)<='9')
            {
                int digit = hex.charAt(i)-48;
                dec = dec+digit*(int)Math.pow(16,j);
                j++;
            }
            else if(hex.charAt(i)>='A' && hex.charAt(i)<='F')
            {
                int digit = hex.charAt(i)-55;
                dec = dec+digit*(int)Math.pow(16,j);
                j++;
            }
        }
        return dec;
    }
    public static void main(String[] args) {
        String hex = "1A32D";
        System.out.println(toDecimal(hex));
    }
}
