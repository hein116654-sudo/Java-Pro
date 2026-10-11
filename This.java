// Define the Dog class
class Dog {
    // Instance variable to store the dog's name
    String name;

    // Constructor to initialize the dog's name
    Dog(String name) {
        // 'this.name' refers to the instance variable above
        // 'name' refers to the parameter passed into this constructor
        this.name = name;
    }

    // Method to make the dog bark
    void bark() {
        // 'this.name' refers to the name of the specific Dog object calling this method
        System.out.println(this.name + " says: Woof Woof!");
    }
}

// Main class to execute the program
public class This {
    public static void main(String[] args) {

        // 1. Create the first Dog object with the name "Nito"
        Dog dog1 = new Dog("Nito");

        // 2. Create the second Dog object with the name "Aung Net"
        Dog dog2 = new Dog("Aung Net");

        // 3. Call the bark method for each dog individually
        dog1.bark(); // Output: Nito says: Woof Woof!
        dog2.bark(); // Output: Aung Net says: Woof Woof!
    }
}