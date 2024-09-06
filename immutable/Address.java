package in.ganesh.test.immutable;

public class Address {
    private String  city;
    private String state;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String country;

    public Address(String city, String state,String country) {
        this.city = city;
        this.state = state;
        this.country=country;
    }

    public Address(Address address) {
        this(address.getCity(),address.getState(),address.getCountry());
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }


    static Address getInstance(Address address){
        return new Address(address.getCity(),address.getState(),address.getCountry());
    }
}
