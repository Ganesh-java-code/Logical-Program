package in.ganesh.test;

public class SingletonWithSynchronizationLazyInitialization {
    private static SingletonWithSynchronizationLazyInitialization instance = null;
    String s;
    private SingletonWithSynchronizationLazyInitialization(){
        s = "constructor initialized....";
    }
    public synchronized static SingletonWithSynchronizationLazyInitialization getInstance(){
        if (instance==null){
            instance=new SingletonWithSynchronizationLazyInitialization();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonWithSynchronizationLazyInitialization instance1 = getInstance();
        SingletonWithSynchronizationLazyInitialization instance2 = getInstance();
        System.out.println(instance1.hashCode()+" => "+instance2.hashCode());
        if (instance1==instance2){
            System.out.println("same object...");
        }
    }
}
