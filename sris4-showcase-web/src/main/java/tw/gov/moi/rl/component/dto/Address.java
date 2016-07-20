package tw.gov.moi.rl.component.dto;

public class Address {

    private String neighborhood;

    private String street;

    private String village;
    
    public Address(){
        super();
    }

    public Address(String neighborhood, String street, String village) {
        super();
        this.neighborhood = neighborhood;
        this.street = street;
        this.village = village;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

}
