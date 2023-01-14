class primeInRange {
    public static boolean isprime(int m)
    {
        for(int i=2;i<=m/2;i++)
        {
            if(m%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=20;
        for(int i=2;i<=n;i++)
        {
            if(isprime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}
