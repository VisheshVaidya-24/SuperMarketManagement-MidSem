package mypack;
import java.util.*;
public class UserSelection extends Billing
{
    Scanner sc =new Scanner(System.in);
    public byte messageForCustomerSelection()
    {
        System.out.println("Please enter the above mentioned index of your favourable section");
        // for taking choice
        byte userSelectedIndex;   
        userSelectedIndex = sc.nextByte();

        return userSelectedIndex;
    }// we are using this function for scanning purpose and for messaging to user
    public void messageForChoosingList() {
        System.out.println("Here is the list of all the items available !!!");
    }
    public void displayingListOfItems(List<String> list, int numberOfItems)
    {
        for(int i=0;i<numberOfItems;i++)
        {
            System.out.println(list.get(i));
        }
    }
      public void contSection()
    {
        byte flag;
        
        while(true)
        {
           System.out.println("Would you like to  continue in the store   (Y=1/N=0)?");
           flag =sc.nextByte();
           if(flag==1)
            {
               main1();
            }
            else
            { 
                // To terminate whole program
                // int x =finalPrice();
                System.out.println("Final Price : "+sum);
                System.exit(0);   

            }
        }
       
        
    }
}