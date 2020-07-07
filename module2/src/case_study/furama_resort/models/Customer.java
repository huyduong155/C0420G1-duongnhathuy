package case_study.furama_resort.models;

public class Customer {
    private String nameCustomer;
    private String birthday;
    private String gender;
    private String CMND;
    private int numPhone;
    private String email;
    private String customerType;
    private String address;
    Services useService;


    public Customer(String nameCustomer, String birthday, String gender, String CMND, int numPhone,
                    String email, String customerType, String address) {
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.CMND = CMND;
        this.numPhone = numPhone;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public int getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(int numPhone) {
        this.numPhone = numPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfor(){
        System.out.println("Customer{" +
                "name = '" + nameCustomer + '\'' +
                ", birthday = '" + birthday + '\'' +
                ", gender = '" + gender + '\'' +
                ", CMND = " + CMND +
                ", Phone = " + numPhone +
                ", email = '" + email + '\'' +
                ", customerType = '" + customerType + '\'' +
                ", address = " + address +
                ", useService = " + useService +
                '}');
    }
}
