public class Address {
    String town;
    String street;
    String city;
    Address(String town, String street, String city) {
    this.town = town;
    this.street = street;
    this.city = city;
    }

public void setTown(String town) {
        this.town = town;}
 public void setStreet(String street) {
        this.street = street;}
  public void setCity(String city) {
        this.city = city;}
 public String getTown() {
        return town;}
 public String getStreet() {
        return street;}
 public String getCity() {
        return city;}
    @Override
    public String toString() {
        return "Address{" + "town=" + town + ", street=" + street + ", city=" + city + '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Address address = (Address) obj;
        return this.town.equals(address.town) && this.street.equals(address.street) && this.city.equals(address.city);
    }

    public void Cloneaddress(){
         Address address = new Address(this.town, this.street, this.city);
        }
}
