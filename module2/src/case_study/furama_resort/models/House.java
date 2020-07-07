package case_study.furama_resort.models;

public class House extends Services implements Comparable<House> {
    private String roomStandard;
    private String otherFacilities;
    private int floor;

    public House(String id, String nameServices, double useArea, double rentalCosts, int person,
                 String rentType, String roomStandard, String otherFacilities, int floor) {
        super(id, nameServices, useArea, rentalCosts, person, rentType);
        this.roomStandard = roomStandard;
        this.otherFacilities = otherFacilities;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherFacilities() {
        return otherFacilities;
    }

    public void setOtherFacilities(String otherFacilities) {
        this.otherFacilities = otherFacilities;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public void showInfor() {
        System.out.println("House {" +"id='" + this.getId() + '\'' +
                ", nameServices='" + this.getNameServices() + '\'' +
                ", useArea=" + this.getUseArea() +
                ", rentalCosts=" + this.getRentalCosts() +
                ", person=" + this.getPerson() +
                ", rentType='" + this.getRentType() + '\'' +
                "roomStandard='" + roomStandard + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", floor=" + floor +
                '}');
    }

    @Override
    public int compareTo(House o) {
        return this.getNameServices().compareTo(o.getNameServices());
    }
}
