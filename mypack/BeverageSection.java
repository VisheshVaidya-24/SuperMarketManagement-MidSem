package mypack;
import java.util.*;
import java.io.FileReader; 
import java.io.IOException;


public class BeverageSection extends UserSelection
{
    public void BeverageList()
    {
        List <String> BeverageItemList=new ArrayList<>();
        BeverageItemList.add("1} Tea\n");
        BeverageItemList.add("2} Coffee\n");
        BeverageItemList.add("3} Soft Drinks\n");
        // listing of beverages
        messageForChoosingList();
        displayingListOfItems(BeverageItemList,3); 
       byte beverageCategorySelectedNumber = messageForCustomerSelection();
       switch(beverageCategorySelectedNumber)
        {
            case 1:
            {
                teaDetails();
                break;
            }
            case 2:
            {
                coffeeDetails();
                break;
            }
            case 3:
            {
                softdrinksDetails();
                break;
            }
        }// end of switch
    }// end of BeverageList

        public void teaDetails()
        {
            
            try{
                char[] flight  = new char[1000];
                FileReader input = new FileReader("beverageteadetails.txt");
                input.read(flight);
                System.out.println(flight);
                input.close();
            }
            catch (IOException e) {
                System.out.println("File error...");
            }   
            inputIndexQuantity();
            calPrice();
            contSection();
        }// end of tea details

        public void coffeeDetails()
        {
            try{
                char[] flight  = new char[1000];
                FileReader input = new FileReader("beveragecoffeedetails.txt");
                input.read(flight);
                System.out.println(flight);
                input.close();
            }
            catch (IOException e) {
                System.out.println("File error...");
            }   
           inputIndexQuantity();
           calPrice();
           contSection();
        }// end of coffee details

        public void softdrinksDetails()
        {
            
            try{
                char[] flight  = new char[1000];
                FileReader input = new FileReader("beveragesoftdrinkdetails.txt");
                input.read(flight);
                System.out.println(flight);
                input.close();
            }
            catch (IOException e) {
                System.out.println("File error...");
            }
             inputIndexQuantity();
             calPrice();
             contSection();
        }// end of softdrink details
}