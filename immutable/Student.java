package in.ganesh.test.immutable;

final public class Student {
    final  private int id;
    final  private String studentName;
    final private Address address;

    public Student(int id, String studentName, Address address) {
        this.id=id;
        this.studentName=studentName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public Address getAddress() {
        return Address.getInstance(address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", address=" + address +
                '}';
    }
}
