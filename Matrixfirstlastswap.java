import java.util.Scanner;
class Matrixfirstlastswap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            int temp=arr[0][i];
            arr[0][i]=arr[n-1][i];
            arr[n-1][i]=temp;
        }
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
