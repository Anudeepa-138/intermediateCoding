class Armstrong {
    public static void main(String[] args) {
        int n = 1634,sum=0,c=0;
        int temp=n;
        int m=n;
        while(m!=0)
        {
            c++;
            m=m/10;
        }
        while(n!=0)
        {
            sum+=Math.pow(n%10,c);
            n=n/10;
        }
        System.out.println(sum+" "+c);
        if(sum==temp)
        {
            System.out.print("Armstrong");
        }
        else
        {
            System.out.print("not a armstrong number");
        }
    }
    
}
