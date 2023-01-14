class AIR {
    public static void main(String[] args) {
        int n=1000;
        for(int i=1;i<=n;i++)
        {
            if(isArmstrong(i))
            {
                System.out.print(i+" ");
            }
        }
        
    }
    public static boolean isArmstrong(int i)
    {
        int sum=0,c=0;
        int temp=i;
        int m=i;
        while(m!=0)
        {
            c++;
            m=m/10;
        }
        while(i!=0)
        {
            sum+=Math.pow(i%10,c);
            i=i/10;
        }
        if(sum==temp)
        {
            return true;
        }
        return false;
    }
}
