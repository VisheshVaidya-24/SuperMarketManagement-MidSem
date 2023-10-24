package mypack;
import java.util.*;
import java.io.FileReader; 
import java.io.IOException;
public class PersonalCareSection extends UserSelection

{
    public void PersonalCareList()
    {
        List <String> PersonalCareList=new ArrayList<>();
        PersonalCareList.add("1} Hygiene Products\n");
        PersonalCareList.add("2} BodyCare\n");
        PersonalCareList.add("3} FirstAid\n");
        // listing of personal care list
        messageForChoosingList();
        displayingListOfItems(PersonalCareList,3); 
        byte personalCareCategorySelectedNumber = messageForCustomerSelection();
        switch(personalCareCategorySelectedNumber)
        {
            case 1:
            {
                hygieneProductsDetails();
                break;
            }
            case 2:
            {
                bodycareDetails();
                break;
            }
            case 3:
            {
                firstAidDetails();
                break;
            }
        }// end of switch
    }//end of list personal care list

    public void hygieneProductsDetails()
    {
           try{
            char[] flight  = new char[1000];
            FileReader input = new FileReader("personalcarehygiene.txt");
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
        }// end of hygieneProductDetails

    public void bodycareDetails()
    {
         try{
            char[] flight  = new char[1000];
            FileReader input = new FileReader("personalcarebodycare.txt");
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
    }// end of bodycare details

    public void firstAidDetails()
    {
         try{
            char[] flight  = new char[1000];
            FileReader input = new FileReader("personalcarefirstaiddetails.txt");
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
    }// end of first aid details

    

}