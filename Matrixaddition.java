import java.util.Scanner;
public class Matrixaddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            int size=sc.nextInt();
            int arr[][]=new int[size][size+1];
            for(int i=0;i<size;i++) 
            {
                for(int j=0;j<size;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            int rowsums[]=new int[size];
            int colsums[]=new int[size];
            for(int i=0;i<size;i++) 
            {
                for(int j=0;j<size;j++)
                {
                    rowsums[i]+=arr[i][j];
                    colsums[j]+=arr[i][j];
                }
            }
            for(int i=0;i<size;i++)
            {
                arr[i][size]=rowsums[i];
            }
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size+1;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("");
            }
            int sum=0;
            for(int j=0;j<size;j++)
            {
                System.out.print(colsums[j]+" ");
                sum+=colsums[j];
            }
            System.out.print(sum);
        }
    }
}
