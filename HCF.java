public class HCF {
    public static void main(String[] args) {
        int n1 = 36,n2=12;
        int lcm = n1*n2;
        while(n1 != n2)
        {
            if(n1 > n2)
            {
                n1-=n2;
            }
            else{
                n2-=n1;
            }
        }
        System.out.println(n1);
        System.out.println(lcm/n1);
    }
}
