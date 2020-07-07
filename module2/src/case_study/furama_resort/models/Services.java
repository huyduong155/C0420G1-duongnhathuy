package case_study.furama_resort.models;

public abstract class Services {
    private String id;
    private String nameServices;
    private double useArea;
    private double rentalCosts;
    private int person;
    private String rentType;

    public Services() {
    }

    public Services(String id, String nameServices, double useArea, double rentalCosts, int person, String rentType) {
        this.id = id;
        this.nameServices = nameServices;
        this.useArea = useArea;
        this.rentalCosts = rentalCosts;
        this.person = person;
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }
    public abstract void showInfor();

}
