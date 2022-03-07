package creational.singleton;

public class SingletonDesignPattern {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singletonTwo = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(singletonTwo.hashCode());
    }
}
