package mypack;
import java.util.*;
import java.io.FileReader; 
import java.io.IOException;
public class FreshProduceSection extends UserSelection
{
    public void FreshProduceList()
    {
        List <String> FreshProduceList=new ArrayList<>();
        FreshProduceList.add("1} Fruits\n");
        FreshProduceList.add("2} Vegetables\n");
        FreshProduceList.add("3} Meat\n");
        // listing of fresh produce
        messageForChoosingList();
        displayingListOfItems(FreshProduceList,3); 
       byte freshProduceCategorySelectedNumber = messageForCustomerSelection();
       switch(freshProduceCategorySelectedNumber)
        {
            case 1:
            {
                fruitsDetails();
                break;
            }
            case 2:
            {
                vegetablesDetails();
                break;
            }
            case 3:
            {
                meatDetails();
                break;
            }
        }// end of switch
    }// end of fresh produce list
    public void fruitsDetails()
    {
          try{
            char[] data  = new char[1000];
            FileReader input = new FileReader("freshproducefruitdetails.txt");
            input.read(data);
            System.out.println(data);
            input.close();
        }
        catch (IOException e) {
			System.out.println("File error...");
		}
         inputIndexQuantity();
         calPrice();   
         contSection();
     
    }// end of fruits details

    public void vegetablesDetails()
    {
        try{
            char[] data  = new char[1000];
            FileReader input = new FileReader("freshproducevegetabledetails.txt");
            input.read(data);
            System.out.println(data);
            input.close();
        }
        catch (IOException e) {
			System.out.println("File error...");
		}
        inputIndexQuantity();
        calPrice();
        contSection();
    }// end of vegetables details

    public void meatDetails()
    {
        try{
            char[] data  = new char[1000];
            FileReader input = new FileReader("freshproducemeatdetails.txt");
            input.read(data);
            System.out.println(data);
            input.close();
        }
        catch (IOException e) {
			System.out.println("File error...");
		}
      inputIndexQuantity();
      calPrice();
      contSection();
    }// end of meat details
   
}