
package mypack;
import java.util.*;
import java.io.FileReader; 
import java.io.IOException;
// import mypack.*;
public class GrocerySection extends UserSelection 
{
    public void groceryList()
    {
        List <String> groceryItemList=new ArrayList<>();
        groceryItemList.add("1} Cereals\n");
        groceryItemList.add("2} Snacks\n");
        groceryItemList.add("3} CookingIngredients\n");
        // listing of grocery items
        messageForChoosingList(); 

        displayingListOfItems(groceryItemList,3);  
        byte groceryCategorySelectedNumber = messageForCustomerSelection();
        // calling method on the basis of choosen index
        switch(groceryCategorySelectedNumber)
        {
            case 1:
            {
                cerealsDetails();
                break;
            }
            case 2:
            {
                snacksDetails();
                break;
            }
            case 3:
            {
                cookingIngredientsDetails();
                break;
            }
        }

    } // ends of groceryList

    public void cerealsDetails() {
        GrocerySection obj = new GrocerySection(); 
          try{
            char[] flight  = new char[1000];
            FileReader input = new FileReader("GroceryCerealDetails.txt");
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
    }// end of cerelasDetails

    public void snacksDetails() {
          try{
            char[] flight  = new char[1000];
            FileReader input = new FileReader("GrocerySnackDetails.txt");
            input.read(flight);
            System.out.println(flight);
            input.close();
        }
        catch (IOException e) {
			System.out.println("File error...");
		}
       
       inputIndexQuantity();
       calPrice();
       contSection();  // for repeating
    } //end of snack details

    public void cookingIngredientsDetails() {
            try{
            char[] flight  = new char[1000];
            FileReader input = new FileReader("Grocerycookingdetails.txt");
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
    } // end of cookingIngredientsDetails
}