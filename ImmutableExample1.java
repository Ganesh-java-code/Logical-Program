package in.ganesh.test;

// class is final
final class ImmutableExample1 {

    // private member variable
    private final int i;
    // parameterized constructor
    public ImmutableExample1(int i){
        this.i=i;
    }
    // public method
    public ImmutableExample1 modifyData(int i){
        if ( this.i==i ){
            return this;
        }else {
            return new ImmutableExample1(i);
        }
    }
    // only getters
    public int getI() {
        return i;
    }

    public static void main(String[] args) {

        ImmutableExample1 t1 = new ImmutableExample1(10);
        ImmutableExample1 t2 = t1.modifyData(1);
        System.out.println(t1.hashCode()+" "+t2.hashCode());
    }
}
