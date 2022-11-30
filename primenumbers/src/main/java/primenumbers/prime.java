package primenumbers;

import java.util.Scanner;

public class prime {
    static int num;
    public static void main(String[]args){
       Scanner input=new Scanner(System.in);
        //ask the student to enter the first number
        System.out.println("Enter the first number");
        //prompts user to enter the number
        num=input.nextInt();
       int count = 0;
       for(int i=1; i<=num; i++){
           if (num% i==0){
               count++;
           }
       }
       if (count==2){
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
    }
}