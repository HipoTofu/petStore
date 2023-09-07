package prelims;
import java.util.Scanner;

public class petStoreAct {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Petstore v1.0");
        
        Scanner myPet = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Select Pet (Dog, Cat, Fish, Bird, Reptiles): ");
	    
        String myPetStr = myPet.nextLine();  // Read user input
        
        
        Scanner myBreed = new Scanner(System.in);  // Create a Scanner object
	    if (myPetStr.matches("Dog")) {
	        System.out.println("Select Breed (Bulldog, Poodle, Golden Retriever, Labrador, Chihuahua, Dalmation): ");
	    } 
	    else if (myPetStr.contentEquals("Cat")) {
	        System.out.println("Select Breed (Manx, Persian): ");
        } 
	    else if (myPetStr.contentEquals("Fish")){
	        System.out.println("Select Breed (Angelfish, Tiger Shark, Koi, Goldfish): ");
	    }
	    else if (myPetStr.contentEquals("Bird")){
	        System.out.println("Select Breed (Amazon Parrot, Finch): ");
	    }
	    else if (myPetStr.contentEquals("Reptiles")){
	        System.out.println("Select Breed (Rattlesnake, Iguana): ");
	    }
	    else {
            System.out.println("Not Existing Pet");
        }
	    

        String myBreedStr = myBreed.nextLine();  // Read user input
        
        //Dogs
        if (myBreedStr.matches("Labrador")) {
        	System.out.println("Item ID        Product ID        Description                List Price");    
        	System.out.println("EST-22          K9-RT-02    Adult Male Labrador Retriever      $135.50");
        	System.out.println("EST-23          K9-RT-02    Adult Female Labrador Retriever    $145.49");
        }
        
        else if (myBreedStr.matches("Bulldog")) {
            System.out.println("Item ID        Product ID      Description                List Price");    
            System.out.println("EST-6           K9-BD-01    Male Adult Bulldog             $18.50");
            System.out.println("EST-7           K9-BD-01    Female puppy Bulldog           $18.50");
        }
        else if (myBreedStr.matches("Poodle")) {
            System.out.println("Item ID        Product ID       Description                List Price");    
            System.out.println("EST-8           K9-PO-02     Male puppy Poodel              $18.50");
        }
        else if (myBreedStr.matches("Golden Retriever")) {
            System.out.println("Item ID        Product ID          Description                       List Price");    
            System.out.println("EST-28          K9-RT-01      Adult Female Golden Retriver             $155.29");
        }
        else if (myBreedStr.matches("Dalmation")) {
            System.out.println("Item ID        Product ID      Description                           List Price");    
            System.out.println("EST-9           K9-DL-01    Spotless Male Puppy Dalmation	      $18.50");
            System.out.println("EST-10          K9-DL-01    Spotted Adult Female Dalmation            $18.50");
        }
        else if (myBreedStr.matches("Chihuahua")) {
            System.out.println("Item ID        Product ID        Description                         List Price");    
            System.out.println("EST-26          K9-CW-01      Adult Male Chihuahua	              $125.50");
            System.out.println("EST-27          K9-CW-01      Adult Female Chihuahua                  $155.29");
        }
        
        //Cats
        else if (myBreedStr.matches("Manx")) {
            System.out.println("Item ID        Product ID          Description                       List Price");    
            System.out.println("EST-14         FL-DSH-01         Tailless Manx                        $58.50");
            System.out.println("EST-15         FL-DSH-01         With Tail Manx                       $23.50");
        }
        else if (myBreedStr.matches("Persian")) {
            System.out.println("Item ID        Product ID          Description                       List Price");    
            System.out.println("EST-16         FL-DLH-02       Adult Male Persian                      $93.50");
            System.out.println("EST-17         FL-DLH-02       Adult Female Persian                    $93.50");
        }
        
        //Fish Angel Fish, Tiger Shark, Koi, Goldfish
        else if (myBreedStr.matches("Angelfish")) {
            System.out.println("Item ID        Product ID          Description                       List Price");    
            System.out.println("EST-1          FI-SW-01         Large Angelfish                       $16.50");
            System.out.println("EST-2          FI-SW-01         Small Angelfish                       $16.50");
        }
        else if (myBreedStr.matches("Tiger Shark")) {
            System.out.println("Item ID        Product ID          Description                       List Price");    
            System.out.println("EST-3          FI-SW-02        Toothless Tiger Shark                  $18.50");
        }
        else if (myBreedStr.matches("Koi")) {
            System.out.println("Item ID        Product ID          Description                       List Price");    
            System.out.println("EST-4          FI-FW-01            Spotted Koi                        $18.50    ");
            System.out.println("EST-5          FI-FW-01            Spotless Koi                       $18.50  ");
        }
        else if (myBreedStr.matches("Goldfish")) {
            System.out.println("Item ID        Product ID          Description                       List Price");    
            System.out.println("EST-20          FI-FW-02       Adult Male Goldfish                    $5.50");
            System.out.println("EST-21          FI-FW-02       Adult Female Goldfish                  $5.29");
        } 
        
        //Bird Amazon Parrot, Finch
        else if (myBreedStr.matches("Amazon Parrot")) {
            System.out.println("Item ID        Product ID          Description                       List Price");    
            System.out.println("EST-18          AV-CB-01       Adult Male Amazon Parrot               $193.50");
        }
        else if (myBreedStr.matches("Finch")) {
            System.out.println("Item ID        Product ID          Description                       List Price");    
            System.out.println("EST-19          AV-SB-02         Adult Male Finch                     $15.50");
        }
        
        //Reptile
        else if (myBreedStr.matches("Rattlesnake")) {
            System.out.println("Item ID        Product ID          Description                       List Price");    
            System.out.println("EST-11          RP-SN-01       Venomless Rattlesnake                   $18.50");
            System.out.println("EST-12          RP-SN-01       Rattleless Rattlesnake                  $18.50");
        } 
        else if (myBreedStr.matches("Iguana")) {
            System.out.println("Item ID        Product ID          Description                       List Price");    
            System.out.println("EST-13          RP-LI-02        Green Adult Iguana                     $18.50");

        } 
        else {
            System.out.println("Not Existing Breed");
        }


	}

}
