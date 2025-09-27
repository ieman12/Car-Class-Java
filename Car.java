
/**
 * This class represent a car that should include make, model etc...
 * Car detail can be accesed by using this class.
 * At the end when user will enter all the details asked the system should
 print the detail to the user. 
 * @author (Ieman Sajid)
 * @version (12/10.2024)
 */
public class Car
{
    // That's for the make of the car.
    private String make;
    // That's for the model of the car.
    private String model;
    // That's for measuring the fuel in miles per gallon.
    private int milesPerGallon;
    // The price for what the car was purchased.
    private int initialPurchasePrice;
    //That's the current purchase price.
    private int purchasePrice;
    // That's for asking the name of the current owner.
    private String nameOfOwner;
    //That's for stating the total number of owner who had the car.
    private int numberOfOwners;
    // That's for whether the car has catalytic converter (true or false).
    private boolean hasConverter;
   
/**
* Constructor for objects of class Car.
* As shown in the barkets I included 5 specific parameters required. 
 */
    public Car(String newMake, String newModel, int newMilesPerGallon, int newInitialPurchasePrice, boolean newHasConverter ) 
    {
        //This is for setting the make of the car.
        make = newMake;
        // This for setting the model of the car.
        model = newModel;
        // This sets the miles per Gallon.
        milesPerGallon = newMilesPerGallon;
        //This set the initial purchase price.
        initialPurchasePrice = newInitialPurchasePrice;
        //This set the current purchase price. 
        purchasePrice = 0;
        //This is for entring the name of the owner.
        nameOfOwner = "Enter your name";
        numberOfOwners = 0;
        //This set whether the car has a catalytic converter.
        hasConverter = newHasConverter; 
    }
 
/**
*Use Mutator method to set up a purchase price.
*Purchase price will update when the car is sold.
*
*/
     public void setPurchasePrice(int newPurchasePrice) 
    {
        purchasePrice = newPurchasePrice;
    }
    
/**
* Set the name of the current owner of the car. 
* It should also update to the new owner. 
*/
 public void setOwner(String newOwnerName)
 {
        nameOfOwner = newOwnerName;
    }
  
/**
* Set the catalytic converter to true
*/
 public void goingCleaner()
 {
        hasConverter = true;
    }
    
/**
* Seet accessor Car methods.
* It should return the make of the car.
*/
 public String getMake() 
 {
        return make;
    }

/**
* It should return the model of the car.
*/
public String getModel() 
{
        return model;
    }
    
/**
* It should return  the purchase price of the car.
*/
public int getPurchasePrice() 
{
        return purchasePrice;
    }

/**
 * This should print the detail of the car to the user.
 * To mekiing a bit cleaner I used System.out.println that will print the
 text into a new line. 
 */
public void printDetails() 
{
    System.out.println("This vehicle is a " + make + " " + model + ". ");
    System.out.println("It has had " + numberOfOwners + " owners and its present owner is " + nameOfOwner + ". " );
    System.out.println("It does " + milesPerGallon + " miles per gallon and It " + (hasConverter ? "has" : "does not have") + " a catalytic converter.");
    System.out.println("The original purchase price was £" + initialPurchasePrice + " and the price is now £" + getPurchasePrice() + ".");
}

/**
 * Selling the car
 * It will update the purchase price when the car is sold.
 * It will update the owner when the car is sold.
 * It should also increase the number of the owners. 
 */
public void sell(int newPrice, String newOwner) 
{
        purchasePrice = newPrice;
        nameOfOwner = newOwner; 
        numberOfOwners ++;
        
}

/**
*The if statement is used to check the car catalytic converter status. 
*It should print out the message given on the assignment. 
*/
 public String checkCarConverter() 
 {
        if (hasConverter) {
            return "Be aware that your car could be less polluting.";
        //That's the warning for the user, for no converter.
        } else {
            return "This car is better for the environment.";
        // Telling user that it does have a converter.
        }
    }

    
    
}
