package creational.prototype;

public class PrototypeDesignPattern {

    public static void main(String[] args) throws CloneNotSupportedException {

        CoffeeShop coffeeShopOne = new CoffeeShop();
        coffeeShopOne.setShopName("AAA");
        coffeeShopOne.loadCoffee();

        CoffeeShop coffeeShopTwo = coffeeShopOne.clone();
        coffeeShopTwo.setShopName("BBB");

        coffeeShopOne.getCoffeeTypes().remove(0);

        System.out.println(coffeeShopOne);
        System.out.println(coffeeShopTwo);
    }
}
