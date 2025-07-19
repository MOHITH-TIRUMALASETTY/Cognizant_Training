import java.util.Scanner;
public class Assignment8{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the index of array want to access:");
        int m=sc.nextInt();
        System.out.println(arr[m]);
    }
}