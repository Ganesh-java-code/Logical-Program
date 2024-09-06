package in.ganesh.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ImmutableExample3 {
    private final String name;
    private final int age;
    private final Map<String, String> properties; // Mutable property

    // Constructor
    public ImmutableExample3(String name, int age, Map<String, String> properties) {
        this.name = name;
        this.age = age;
        // Create a defensive copy of the mutable Map
        this.properties = new HashMap<>(properties);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for properties
    public Map<String, String> getProperties() {
        // Return an unmodifiable view of the Map to prevent modifications
        return Collections.unmodifiableMap(properties);
    }

    public static void main(String[] args) {

        // Main method for testing

        Map<String, String> properties = new HashMap<>();
        properties.put("key1", "value1");
        properties.put("key2", "value2");

        ImmutableExample3 immutableObject = new ImmutableExample3("John Doe", 30, properties);

        System.out.println("Name: " + immutableObject.getName());
        System.out.println("Age: " + immutableObject.getAge());
        System.out.println("Properties: " + immutableObject.getProperties());

        // Try modifying the original Map
        properties.put("key3", "value3");
        System.out.println("Modified Original Properties: " + properties);
        System.out.println("Immutable Class Properties: " + immutableObject.getProperties());

        // Try modifying the returned Map from the getter
        Map<String, String> retrievedProperties = immutableObject.getProperties();
        try {
            retrievedProperties.put("key4", "value4");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify immutable properties map.");
        }
        System.out.println("Immutable Class Properties After Attempted Modification: " + immutableObject.getProperties());
    }
    }

