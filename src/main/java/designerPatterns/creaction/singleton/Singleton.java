package designerPatterns.creaction.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    private static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
