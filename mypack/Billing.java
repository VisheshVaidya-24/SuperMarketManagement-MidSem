package mypack;
import java.util.Scanner;
public  class Billing  extends TempMain{
    int []indexOfItem = new int[100];
    int []quantityOfItem = new int[100];
    static int sum  =0;
    // int []totalPrice=new int [100];
    int i=0,j=0;
    public void inputIndexQuantity()
    {
        Scanner sc = new Scanner(System.in);
        byte flag;
        do
        {
            System.out.println("Enter the index of your favourable item and Quantity respectively !!!");
            int index = sc.nextInt();
            indexOfItem[index] = 1;
            quantityOfItem[index] = sc.nextInt();
            System.out.println("Would you like to choose any item from the list (Y=1/N=0)?");
            flag=sc.nextByte();
        }while(flag==1);

    } 
    public void calPrice() {
     
        for(int k=1;k<=75;k++)  // index starts from 1 to 75
        {
            sum+=(100*quantityOfItem[k]);
        }   
        System.out.println("Current price : "+sum);
    
        // totalPrice[k++]=sum;
    }
    // public int finalPrice()
    // {
    //     return sum;

    // }
}