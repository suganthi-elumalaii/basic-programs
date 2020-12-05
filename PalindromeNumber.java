public class PalindromeNumber {
    public static void main(String args[]){
        int num=56765,rem,temp,rev=0;
        temp=num;
        while(num>0)
        {
            rem=num%10;
            num=num/10;
            rev=rev*10+rem;
        }
        if(temp==rev)
        {
            System.out.println(+temp+ " is a palindrome number");
        }
        else 
        System.out.println(+temp+ " is not a palindrome");
    }
}
