import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr=new int[n][];
		int i,j;
		for(i=0;i<n;i++)
		{
		    arr[i]=new int[sc.nextInt()];
		}
		for(i=0;i<arr.length;i++)
		{
		    for(j=0;j<arr[i].length;j++)
		    {
		        arr[i][j]=sc.nextInt();
		    }
		}
		for(i=0;i<arr.length;i++)
		{
		    for(j=0;j<arr[i].length;j++)
		    {
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
