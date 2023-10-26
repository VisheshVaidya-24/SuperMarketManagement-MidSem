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
        while(userSelectedIndex>5)
        {
            System.out.println("Please Enter the above mentioned index!!!");
            userSelectedIndex = sc.nextByte();
        }

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
           System.out.println("Would you like to proceed to the final billing section or do you want to remove some item from the list?  (To remove = 1/To proceed = 0)?"); 
           flag =sc.nextByte();
           if(flag==1)
            {
                // int []removingIndex = new int[100]; 
            //    main1();
                int index,quanToBeRemoved,check;
                while(true)
                {
                    System.out.println("Enter the indexes of item and quantity which you want to remove respectively !!!"); 
                    index = sc.nextInt();
                    quanToBeRemoved = sc.nextInt();
                    if(quanToBeRemoved<=quantityOfItem[index])
                    {
                        quantityOfItem[index]= quantityOfItem[index]- quanToBeRemoved;
                    }
                    else
                    {
                        System.out.println("Please Enter the correct quantity to be removed!!!");
                    }
                    System.out.println("Do you want to continuing removing items further?(Y=1/N=0)");
                    check=sc.nextInt();
                    if(check==1)
                        continue;
                    else  
                    {
                        // goto label;
                        break;

                    } 
                }
            }
            else
            { 
                // To terminate whole program
                // int x =finalPrice();s
                int i;
                int finalPrice = 0; 
                for(i=1;i<=75;i++)
                {
                    finalPrice+=(100*quantityOfItem[i]);
                }
                System.out.println("Final Price : "+finalPrice);
                System.exit(0);   

            }
        }
           
        
    }
}