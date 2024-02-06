package in.ganesh.test;

public class SingletonWithSynchronizationDoubleCheckLazyInitlztion {
    private static SingletonWithSynchronizationDoubleCheckLazyInitlztion instance = null;

    String s;
    private SingletonWithSynchronizationDoubleCheckLazyInitlztion() {
        s="constructor initialized...";
        System.out.println(s);
    }

    public synchronized static SingletonWithSynchronizationDoubleCheckLazyInitlztion getInstance(){
        if (instance==null) {
            synchronized (SingletonWithSynchronizationDoubleCheckLazyInitlztion.class) {
                if (instance==null){
                    instance=new SingletonWithSynchronizationDoubleCheckLazyInitlztion();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonWithSynchronizationDoubleCheckLazyInitlztion instance1 = getInstance();
        SingletonWithSynchronizationDoubleCheckLazyInitlztion instance2 = getInstance();
        if (instance1==instance2){
            System.out.println("pointing to same object..");
        }
    }
}
