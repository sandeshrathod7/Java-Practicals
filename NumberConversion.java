import java.util.Scanner;

class NumberConversion{

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);

        System.out.println("Enter any number with it base also.");
         System.out.print("number:");
        String number=input.next();
        System.out.print("base:");
        int base= input.nextInt();

       int decimalNo=Integer.parseInt(number,base);

        System.out.println("The decimal number is:"+decimalNo);



    }
}