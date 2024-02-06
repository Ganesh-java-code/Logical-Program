package in.ganesh.test;

public class SingletonWithEagerInitializationSynchronizationEx {
    private static SingletonWithEagerInitializationSynchronizationEx instance = new SingletonWithEagerInitializationSynchronizationEx();
    String s;
    private SingletonWithEagerInitializationSynchronizationEx(){
        s = "constructor initialized...";
        System.out.println(s);
    }
    public synchronized  static SingletonWithEagerInitializationSynchronizationEx getInstance(){
        return instance;
    }
    public static void main(String[] args) {
        SingletonWithEagerInitializationSynchronizationEx instance1 = getInstance();
        SingletonWithEagerInitializationSynchronizationEx instance2 = getInstance();
        if (instance1.hashCode()==instance2.hashCode()){
            System.out.println("poiniting to same object...");
        }
    }
}
