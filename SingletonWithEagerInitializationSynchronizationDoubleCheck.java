package in.ganesh.test;

public class SingletonWithEagerInitializationSynchronizationDoubleCheck {
    private static final SingletonWithEagerInitializationSynchronizationDoubleCheck instance = new SingletonWithEagerInitializationSynchronizationDoubleCheck();
    String s;
    private SingletonWithEagerInitializationSynchronizationDoubleCheck(){
        s = "constructor initialized...";
        System.out.println(s);
    }
    public synchronized static SingletonWithEagerInitializationSynchronizationDoubleCheck getInstance() {
        if (instance != null) {
            synchronized (SingletonWithEagerInitializationSynchronizationDoubleCheck.class) {
                if (instance!=null){
                    return instance;
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        SingletonWithEagerInitializationSynchronizationDoubleCheck instance1 = getInstance();
        SingletonWithEagerInitializationSynchronizationDoubleCheck instance2 = getInstance();
        if (instance1.hashCode()==instance2.hashCode()){
            System.out.println("poiniting to same object...");
        }
    }
}
