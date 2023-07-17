
package ex2;

import java.util.Scanner;


public class Ex2 {
public int count(int r,int u,int arr[],int n){
   if(arr==null)
       return -1;
   int total=r*u;
   int f=0,h=0;
   for(int i=0;i<5;i++){
       f=f+arr[i];
       h++;
       if(f>=total){
           return h;
       }
   }
   return 0;
}
    
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc=new Scanner(System.in);
        Ex2 e=new Ex2();
       int j=0,k=0,i=0;
        System.out.println("enter food of houses");
        int arr[]=new int[5];
        for( int y=0;y<5;y++)
            arr[y]=sc.nextInt();
          System.out.println("enter number of rat");
         int a=sc.nextInt();
           System.out.println("food/rat");
         int b=sc.nextInt();
         int c=a*b;
         System.out.println("total food need "+c);
         int m=e.count(a,b,arr,5);
         System.out.println("no of house "+m);
         
//            //{
//             j=arr[0];
//             if(c<j)
//                 System.out.println("food avalible 1st house");
//             else{
//                 for( i=1;i<5;i++)
//                    j=arr[i]+j;
//                k=i;
//             }
//             System.out.println("food avalible "+(k)+" house"); 
//             else{
//                 if(c<j)
//                     System.out.println("food avalible "+2+" house");
//                 else{
//                     for(int i=1;i<4;i++)
//                        j=j+arr[i];
//                 }
//             }
        
    }
    
}
