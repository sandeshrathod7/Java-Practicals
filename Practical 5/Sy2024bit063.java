import java.util.Scanner;

public class Sy2024bit063{

   static void pattern(int size ){
    
        for(int i=1;i<=size/2;i++){
            System.out.println("* ".repeat(i)+"  ".repeat(5-2*i)+"* ".repeat(i));
        }
        System.out.println("* ".repeat(size));


        
        for(int i=1;i<=size;i++){
            System.out.println("  ".repeat(i-1)+"* ".repeat(size));
        }

    

        int mid = size / 2 + 1;
        for (int i = 1; i <= mid; i++) {
            System.out.println(" ".repeat(mid - i) + "* ".repeat(i));
        }

        for (int i = mid - 1; i >= 1; i--) {
            System.out.println(" ".repeat(mid - i) + "* ".repeat(i));
        }


       
        int j=1;
        for(int i=1;i<=size;i++){
            for(int k=1;k<=i;k++){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }



        
      
       for(int i=1;i<=mid;i++){
           System.out.print(" ".repeat(mid-i));
           int num=i;
           for(j=1;j<=i;j++){
               System.out.print(num+" ");
               num++;
           }
           System.out.println();
       }
       for(int i=mid-1;i>=1;i--){
           System.out.print(" ".repeat(mid-i));
           int num=i;
           for(j=1;j<=i;j++){
               System.out.print(num+" ");
               num++;
           }
           System.out.println();
       }


   }

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.print("enter size:");
     int size=input.nextInt();
     pattern(size);
   }
}




