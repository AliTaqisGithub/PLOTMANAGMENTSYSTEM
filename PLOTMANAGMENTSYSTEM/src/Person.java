import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
   private Address address;
//    private Date dob;
    Person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public  void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public  void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public  void setEmail(String email) {
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return String.format("%s\n %s\n %s\n %s\n", firstName, lastName, email, address);
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null|| getClass()!=o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(email, person.email)&&
                Objects.equals(address, person.address);
    }
}

