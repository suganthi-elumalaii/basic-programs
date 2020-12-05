public class ArmstrongNumber {
    public static void main(String args[]){
        int num=1634,temp,c=0,a;
        temp=num;
        while(num>0)
        {
            a=num%10;
            num=num/10;
            c=c+(a*a*a*a);
        }
        if(c==temp)
        System.out.println(+temp+ " is an Armstrong number");
        else
        System.out.println(+temp+ " is not an Armstrong number");
    }
}
