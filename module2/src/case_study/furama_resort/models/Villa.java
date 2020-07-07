package case_study.furama_resort.models;

public class Villa extends Services implements Comparable<Villa>{
    private String roomStandard;
    private String otherFacilities;
    private double poolArea;
    private int floor;


    public Villa(String id, String nameServices, double useArea, double rentalCosts, int person, String rentType,
                 String roomStandard, String otherFacilities, double poolArea, int floor) {
        super(id, nameServices, useArea, rentalCosts, person, rentType);
        this.roomStandard = roomStandard;
        this.otherFacilities = otherFacilities;
        this.poolArea = poolArea;
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public void showInfor() {
        System.out.println("Villa {" +"id='" + this.getId() + '\'' +
                ", nameServices='" + this.getNameServices() + '\'' +
                ", useArea=" + this.getUseArea() +
                ", rentalCosts=" + this.getRentalCosts() +
                ", person=" + this.getPerson() +
                ", rentType='" + this.getRentType() + '\'' +
                "roomStandard='" + roomStandard + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}');
    }


    @Override
    public int compareTo(Villa o) {
        return this.getNameServices().compareTo(o.getNameServices());
    }
}
