# Car Class (Java)

This is a simple Java project that models a car object.  
It allows you to store and display information such as the car's make, model, fuel efficiency, prices, and owner details.  
The program also includes methods to change ownership, update the purchase price, and print all the car’s details in a clear format.

This was one of my first Java projects, created during my early programming coursework.  
It helped me understand basic object-oriented programming concepts such as **classes**, **constructors**, **fields**, and **methods**.

## How to Run
1. Open the project in BlueJ (or any Java IDE).
2. Create a new `Car` object.
3. Set its owner and purchase price using mutator methods.
4. Call `printDetails()` to display information about the car.

## Example
```java
Car myCar = new Car("Ford", "Mondeo", 35, 4500, false);
myCar.setOwner("Mrs Brown");
myCar.setPurchasePrice(3500);
myCar.printDetails();
