package MyPackage;

public class Secretary extends Employee {

    private int coffeeCount = 0;

    public String makeCoffee(){
        this.coffeeCount++;
        return "Coffee";

    }
}
