package in.ganesh.test.immutable1;

import java.util.HashMap;

public class App1 {
    public static void main(String[] args) {
       // Student student = new Student("ganesh");
        FakeStudentMutable studentMutable = new FakeStudentMutable("ganesh");

        Student student = studentMutable;

        HashMap<Student,String> map = new HashMap<>();
        map.put(student,"India");
        studentMutable.setName("om");
        System.out.println(map.get(student));
        System.out.println("*************************");
    }
}
