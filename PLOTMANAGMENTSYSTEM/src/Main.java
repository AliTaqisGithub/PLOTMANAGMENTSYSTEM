//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Plot[] plots = new Plot[5];
        Person[] persons = new Person[10];
        Person person1 = new Person("John", "snow","johnsnow@gamail.com");
        Address address1 = new Address("DHA","marlyn","Lahore");
        Dimmension dim1 = new Dimmension(10,20,10,20);
        Plot plot1 = new Plot("Commercial","123abc",12);
        plot1.addperson(person1);
        plot1.addaddress(address1);
        plot1.adddimension(dim1);
        for (Plot plot : plots) {
            System.out.println("Plot " + plot);
            System.out.println(plot.toString());
        }
    }
    }