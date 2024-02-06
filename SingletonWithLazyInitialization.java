package in.ganesh.test;
public class SingletonWithLazyInitialization {
    private static SingletonWithLazyInitialization instance = null;
    private SingletonWithLazyInitialization(){

    }
    public static SingletonWithLazyInitialization getInstance(){
        if (instance==null){
            instance = new SingletonWithLazyInitialization();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonWithLazyInitialization instance1 = getInstance();
        SingletonWithLazyInitialization instance2 = getInstance();
        System.out.println(instance1.hashCode()+" == "+instance2.hashCode());
    }
}
