public class PrintPattern {
    public static void main(String args[]){
        int row=5,num;
        for(int i=1; i<row; i++)
        {
            num=1;
            for(int j=1; j<=i;j++)
            {
                System.out.print(+num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
