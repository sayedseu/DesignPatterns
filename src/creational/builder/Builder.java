package creational.builder;

public class Builder {

    public static void main(String[] args) {

        HouseBuilder builder = new IglooHouseBuilder();
        CivilEngineer civilEngineer = new CivilEngineer(builder);
        civilEngineer.constructHouse();
        System.out.println(civilEngineer.getHouse());
    }
}
