package Rocxoiu_Mario;
import java.util.List;

public class Hobby {
    private String name;
    List<Address> addresses;

    public Hobby(String name, int frequency, List<Address> addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}