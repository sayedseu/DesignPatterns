package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop implements Cloneable {
    private String shopName;
    private List<Coffee> coffeeTypes = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Coffee> getCoffeeTypes() {
        return coffeeTypes;
    }

    public void setCoffeeTypes(List<Coffee> coffeeTypes) {
        this.coffeeTypes = coffeeTypes;
    }

    @Override
    public String toString() {
        return "CoffeeShop{" +
                "name='" + shopName + '\'' +
                ", coffees=" + coffeeTypes +
                '}';
    }

    public void loadCoffee() {
        for (int i = 0; i < 10; i++) {
            Coffee coffee = new Coffee(i, "Coffee_" + i);
            this.getCoffeeTypes().add(coffee);
        }
    }

    @Override
    protected CoffeeShop clone() throws CloneNotSupportedException {
        CoffeeShop coffeeShop = new CoffeeShop();
        for (Coffee coffee : this.getCoffeeTypes()) {
            coffeeShop.getCoffeeTypes().add(coffee);
        }
        return coffeeShop;
    }
}
