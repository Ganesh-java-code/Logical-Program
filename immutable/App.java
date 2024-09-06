package in.ganesh.test.immutable;

public class App {
    public static void main(String[] args) {

            Address address = new Address("solapur","Maharashtra","india");
            System.out.println("address object 1 : "+address.hashCode());

            Student ganesh = new Student(1,"ganesh patil",address);
            System.out.println(ganesh);

            Address address1 = ganesh.getAddress();
            System.out.println("address object 2 : "+address1.hashCode());
            address1.setCity("pune");
            address1.setState("Maharashtra");
            System.out.println(ganesh);


    }

}
