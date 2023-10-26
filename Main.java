import java.util.*;
import mypack.*;

class Main
{
    
    public static void main(String[] args) 
    {
        System.out.println("Welcome to ShopHub Management System!\n"); // greeting 
        System.out.println("Here is a list of all the products availabel in our market management system\n");
        // listing list of section
        List <String> productList=new ArrayList<>();
        productList.add("1}Grocery Section(Eg-Cereals,Snacks and Chips etc)\n");
        productList.add("2}Garments Section(Eg-Shirt,Jeans etc)\n");
        productList.add("3}Personal Care and Health Products(Eg-Haircare Products,Dental Care,Hygiene Products etc)\n");
        productList.add("4}Fresh Produce(Eg-Fruits,Vegetables, etc)\n");
        productList.add("5}Beverages(Eg-Tea,Coffee,Juice etc)\n");
        // creating instance of class(UserSelection)
        UserSelection objOfUserSelection = new UserSelection();
        //printing a array list
        objOfUserSelection.displayingListOfItems(productList,5);
        byte customerCategorySelectedNumber = objOfUserSelection.messageForCustomerSelection();
        switch(customerCategorySelectedNumber)
        {
            case 1:  // grocery
            {
                GrocerySection objGrocerySection = new GrocerySection();
                objGrocerySection.groceryList();
                break;
            }

            case 2 : // garment
            {
                GarmentSection objGarmentSection = new GarmentSection();
                objGarmentSection.GarmentList();
                break;
            }
            case 3 : // personal care
            {
                PersonalCareSection objPersonalCareSection = new PersonalCareSection();
                objPersonalCareSection.PersonalCareList();
                break;
            }
            case 4 :  // fresh produce section
            {
                FreshProduceSection objFreshProduceSection = new FreshProduceSection();
                objFreshProduceSection.FreshProduceList();
                break;
            }

            case 5: // beverages
            {
                BeverageSection objBeverageSection = new BeverageSection();
                objBeverageSection.BeverageList();
                break;
            }
        }
    }
}