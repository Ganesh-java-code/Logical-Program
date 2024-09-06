package in.ganesh.test;

import java.util.Date;

public final class ImmutableExample2 {
    private final String name;
    private final int age;
    private final Date birthDate; // Date is mutable, so special care is needed

    // Constructor
    public ImmutableExample2(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        // Create a new Date object to ensure the original is not modified
        this.birthDate = new Date(birthDate.getTime());
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for birthDate
    public Date getBirthDate() {
        // Return a new Date object to prevent the original from being modified
        return new Date(birthDate.getTime());
    }

    // Main method for testing
    public static void main(String[] args) {
        Date birthDate = new Date();
        ImmutableExample2 person = new ImmutableExample2("John Doe", 30, birthDate);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Birth Date: " + person.getBirthDate());

        // Try modifying the birthDate object
        birthDate.setTime(0);
        System.out.println("Modified Original Birth Date: " + birthDate);
        System.out.println("Immutable Class Birth Date: " + person.getBirthDate());

        // Try modifying the returned Date object from the getter
        Date retrievedDate = person.getBirthDate();
        retrievedDate.setTime(0);
        System.out.println("Modified Retrieved Birth Date: " + retrievedDate);
        System.out.println("Immutable Class Birth Date After Modification: " + person.getBirthDate());
    }
}
