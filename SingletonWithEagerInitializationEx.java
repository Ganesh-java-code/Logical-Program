package in.ganesh.test;

public class SingletonWithEagerInitializationEx {
    private static SingletonWithEagerInitializationEx instance = new SingletonWithEagerInitializationEx();
    String s;
    private SingletonWithEagerInitializationEx(){
        s = "constructor initialized...";
        System.out.println(s);
    }
    public static SingletonWithEagerInitializationEx getInstance(){
        return instance;
    }
    public static void main(String[] args) {
        SingletonWithEagerInitializationEx instance1 = getInstance();
        SingletonWithEagerInitializationEx instance2 = getInstance();
        if (instance1.hashCode()==instance2.hashCode()){
            System.out.println("poiniting to same object...");
        }
    }
}
