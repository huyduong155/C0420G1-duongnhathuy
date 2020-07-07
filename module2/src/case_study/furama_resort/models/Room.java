package case_study.furama_resort.models;

public class Room extends Services implements Comparable<Room> {
    private String freeServices;

    public Room(String id, String nameServices, double useArea, double rentalCosts,
                int person, String rentType, String freeServices) {
        super(id, nameServices, useArea, rentalCosts, person, rentType);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public void showInfor() {
        System.out.println("Room {" +"id='" + this.getId() + '\'' +
                ", nameServices='" + this.getNameServices() + '\'' +
                ", useArea=" + this.getUseArea() +
                ", rentalCosts=" + this.getRentalCosts() +
                ", person=" + this.getPerson() +
                ", rentType='" + this.getRentType()+
                ",freeServices='" + freeServices + '\'' +
                '}');
    }

    @Override
    public int compareTo(Room o) {
        return this.getNameServices().compareTo(o.getNameServices());
    }
}
