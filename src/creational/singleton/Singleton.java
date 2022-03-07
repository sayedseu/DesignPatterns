package creational.singleton;

public class Singleton {
    public static volatile Singleton obj = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (obj == null) {
            synchronized (Singleton.class) {
                if (obj == null){
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }
}
