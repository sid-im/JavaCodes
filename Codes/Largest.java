package Codes;

import java.util.Scanner;

public class Largest {
        public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)a[i]=sc.nextInt();

     int largest=0;
     for(int i:a){
        largest=Math.max(largest,i);
     }

     System.out.println("Largest: "+largest);

    }
}
