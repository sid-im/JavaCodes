package Codes;

import java.util.*;
// 1 1 2 2 2 3 3 3 4 4 4
public class secondLargest {

    public static void main(String[]args){

       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();

        int secLargest=a[0];
        Arrays.sort(a);
        for(int i=n-1;i>1;i--){
            if(a[i]!=a[i-1]){
                secLargest=a[i-1];
                break;
            }
        }
        System.out.println("Second Largest "+secLargest);
        

    }
    
}
