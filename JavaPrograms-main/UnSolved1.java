import java.io.*;
import java.util.*;
class UnSolved1
{
    public static boolean isMarkovaMatrix(double [][] m)
    {
        int r=3,c=3,i,j;
        double sum;
        boolean result=true;
        for(i=0;i<c;i++)
        {
            sum=0;
            for(j=0;j<r;j++)
            {
                if(m[j][i]>=0)
                {
                    sum=sum+m[j][i];
                }
                else
                {
                    System.out.println("The Matrix Inside Negitive Values is There");
                result=false;
                break;        
                }
                
            }
            if(sum!=1)
            {
            result=false;
            break;
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        int r=3,c=3,i,j;
        double m[][];
        m=new double [r][c];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter " + r +  " X " + c + " Matrix values");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                m[i][j]=in.nextDouble();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
               System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        if(isMarkovaMatrix(m))
        {
System.out.println("This is Markova Matrix");
        }
        else
        {
System.out.println("This is Not  Markova Matrix");
        }

    }
}