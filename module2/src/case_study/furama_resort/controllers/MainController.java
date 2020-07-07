package case_study.furama_resort.controllers;

import case_study.furama_resort.models.*;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class MainController {
   static Scanner scanner = new Scanner(System.in);
    static String coma = ",";
    public static void displayMainMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1.Add New Services" +
                "\n2.Show Services" +
                "\n3.Add New Customer" +
                "\n4.Show Information Of Customer" +
                "\n5.Add New Booking" +
                "\n6.Show Information Of Employee" +
                "\n7.Cinema 4D" +
                "\n8.Find Employeee" +
                "\n9.Exit");
        int choice = 0;
        System.out.print("Enter Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                addNewCustomer();
                displayMainMenu();
                break;
            case 4:
                showInformationCustomer();
                displayMainMenu();
                break;
            case 5:
                addNewBooking();
                displayMainMenu();
                break;
            case 6:
                showInformationOfEmployee();
                break;
            case 7:
                showCinema();
                displayMainMenu();
                break;
            case 8:
                FileEmployee fileEmployee = new FileEmployee();
                fileEmployee.findEmployee();
                displayMainMenu();
                break;
            case 9:
                break;
        }
    }

    //  METHOD READ/WRITE FILE :-------------------------------------------------------------

    public static String readFile(String file_PATH) {
        StringBuffer result = null;
        try {
            FileReader fileReader = new FileReader(file_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            result = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.append(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return String.valueOf(result);
    }

    public static void writeFile(String file_PATH, String string) {
        try {
            FileWriter fileWriterVilla = new FileWriter(file_PATH, true);
            fileWriterVilla.write(string);
            fileWriterVilla.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //  METHOD ADD :-------------------------------------------------------------

    public static void addNewServices() {
        int choice = 0;
        while (choice != 5) {
            System.out.println("----------------");
            System.out.println("1.Add New Villa" +
                    "\n2.Add New House" +
                    "\n3.Add New Room" +
                    "\n4.Back to Menu" +
                    "\n5.Exit");

            System.out.print("Enter Your Choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addNewVila();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    break;
            }
        }
    }

    public static void addNewVila() {
        System.out.println("----------------");
        System.out.println("Enter the villa ID: ");
        String IdVilla = inputId();
        System.out.println("Enter the villa name");
        String nameVilla = inputNameService();
        System.out.print("Enter the use area (m2):  ");
        double useAreaVilla = inputArea();
        System.out.print("Enter rental costs:  ");
        double rentalCostsVilla = inputRentalCost();
        System.out.print("Enter the number of people: ");
        int person = numPerson();
        System.out.print("Enter rental type: ");
        String rentTypeVilla = inputNameService();
        System.out.print("Enter standard villa: ");
        String roomStandardVilla = inputNameService();
        System.out.print("Enter other facilities: ");
        String otherFacilitiesVilla = scanner.nextLine();
        System.out.print("Enter the pool area: ");
        double poolAreaVilla = inputArea();
        System.out.print("Enter the floor number: ");
        int floorVilla = inputNumFloor();
        String file_PATH = "src\\case_study\\furama_resort\\data\\Villa.csv";
        String coma = ",";
        String str = IdVilla + coma + nameVilla + coma + useAreaVilla + coma + rentalCostsVilla + coma + person + coma +
                rentTypeVilla + coma + roomStandardVilla + coma + otherFacilitiesVilla + coma +
                poolAreaVilla + coma + floorVilla + coma + "\n";
        writeFile(file_PATH, str);
        System.out.println("Add New Villa Complete");
    }

    public static void addNewHouse() {
        System.out.println("----------------");
        System.out.println("Enter the house ID: ");
        String IdHouse = inputId();
        System.out.println("Enter the house name: ");
        String nameHouse = inputNameService();
        System.out.print("Enter the use area (m2):  ");
        double useAreaHouse = inputArea();
        System.out.print("Enter rental costs:  ");
        double rentalCostsHouse = inputRentalCost();
        System.out.print("Enter the number of people: ");
        int person = numPerson();
        System.out.print("Enter rental type: ");
        String rentTypeHouse = inputNameService();
        System.out.print("Enter standard house: ");
        String roomStandardHouse = inputNameService();
        System.out.print("Enter other facilities: ");
        String otherFacilitiesHouse = scanner.nextLine();
        System.out.print("Enter the floor number: ");
        int floorHouse = inputNumFloor();
        String file_PATH = "src\\case_study\\furama_resort\\data\\House.csv";
        String str = IdHouse + coma + nameHouse + coma + useAreaHouse + coma + rentalCostsHouse + coma + person + coma +
                rentTypeHouse + coma + roomStandardHouse + coma + otherFacilitiesHouse + coma + floorHouse + coma + "\n";
        writeFile(file_PATH, str);
        System.out.println("Add New House Complete");
    }

    public static void addNewRoom() {
        System.out.println("----------------");
        System.out.println("Enter the room ID: ");
        String IdRoom = inputId();
        System.out.println("Enter the room name: ");
        String nameRoom = inputNameService();
        System.out.print("Enter the use area (m2):  ");
        double useAreaRoom = inputArea();
        System.out.print("Enter rental costs:  ");
        double rentalCostsRoom = inputRentalCost();
        System.out.print("Enter the number of people: ");
        int person = numPerson();
        System.out.print("Enter rental type: ");
        String rentTypeRoom = inputNameService();
        System.out.print("Enter the free services (massage,karaoke,food,drink,car): ");
        String freeServices = inputFreeServices();
        String file_PATH = "src\\case_study\\furama_resort\\data\\Room.csv";
        String str = IdRoom + coma + nameRoom + coma + useAreaRoom + coma + rentalCostsRoom + coma +
                person + coma + rentTypeRoom + coma + freeServices + coma + "\n";
        writeFile(file_PATH, str);
        System.out.println("Add New Room Complete");
    }

    public static void addNewCustomer() {
        System.out.println("----------------");
        System.out.println("Enter the customer name: ");
        String nameCustomer = inputNameCustomer();
        System.out.println("Enter the customer's birthday: ");
        String birthdayCustomer = inputBirthdayCustomer();
        System.out.println("Enter the gender of the customer: ");
        String genderCustomer = inputGenderCustomer();
        System.out.println("Enter the customers ID number: ");
        String idCustomer = inputIdCustomer();
        System.out.println("Enter the customers phone number: ");
        int phoneCustomer = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the customer email: ");
        String emailCustomer = inputEmailCustomer();
        System.out.println("Enter the customers type: ");
        String customerType = scanner.nextLine();
        System.out.println("Enter the customers address: ");
        String addressCustomer = scanner.nextLine();
        String file_PATH = "src\\case_study\\furama_resort\\data\\Customer.csv";
        String coma = ",";
        String str = nameCustomer + coma + birthdayCustomer + coma + genderCustomer + coma + idCustomer + coma + phoneCustomer + coma +
                emailCustomer + coma + customerType + coma + addressCustomer + coma + "\n";
        writeFile(file_PATH, str);
        System.out.println("Add New Customer Complete");
    }

    public static void addNewBooking() {
        String file_PATH_Booking = "src\\case_study\\furama_resort\\data\\Booking.csv";
        List<Customer> customersList = showInformationCustomer();
        boolean bool = true;
        do {
            System.out.print("Enter your choice customer: ");
            int choice = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < customersList.size(); j++) {
                if (choice == j) {
                    String str = customersList.get(j).getNameCustomer() + coma + customersList.get(j).getBirthday() + coma +
                            customersList.get(j).getGender() + coma + customersList.get(j).getCMND() + coma +
                            customersList.get(j).getNumPhone() + coma + customersList.get(j).getEmail() + coma +
                            customersList.get(j).getCustomerType() + coma + customersList.get(j).getAddress() + coma;
                    writeFile(file_PATH_Booking, str);
                    bool = true;
                    break;
                } else if (j == customersList.size() - 1) {
                    System.out.println("No customer found");
                    bool = false;
                }
            }
        } while (!bool);
        bool = true;
        System.out.println("----------------");
        System.out.println("1.Booking Villa" +
                "\n2.Booking House" +
                "\n3.Booking Room");
        int choice;
        System.out.print("Enter your choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                addBookingVilla();
                break;
            case 2:
                addBookingHouse();
                break;
            case 3:
                addBookingRoom();
                break;
        }
    }

    public static void addBookingVilla() {
        String file_PATH_Booking = "src\\case_study\\furama_resort\\data\\Booking.csv";
        boolean bool = true;
        List<Villa> bookingVilla = showAllVila();
        do {
            System.out.print("Enter your choice book villa: ");
            int num = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < bookingVilla.size(); j++) {
                if (num == j) {
                    String string = bookingVilla.get(j).getId() + coma + bookingVilla.get(j).getNameServices() + coma +
                            bookingVilla.get(j).getUseArea() + coma + bookingVilla.get(j).getRentalCosts() + coma +
                            bookingVilla.get(j).getPerson() + coma + bookingVilla.get(j).getRentType() + coma +
                            bookingVilla.get(j).getRoomStandard() + coma + bookingVilla.get(j).getOtherFacilities() +
                            coma + bookingVilla.get(j).getPoolArea() + coma + bookingVilla.get(j).getFloor() + coma + "\n";
                    writeFile(file_PATH_Booking, string);
                    bool = true;
                    break;
                } else if (j == bookingVilla.size() - 1) {
                    System.out.println("No villa found");
                    bool = false;
                }
            }
        } while (!bool);
    }

    public static void addBookingHouse() {
        String file_PATH_Booking = "src\\case_study\\furama_resort\\data\\Booking.csv";
        boolean bool = true;
        List<House> bookingHouse = showAllHouse();
        do {
            System.out.print("Enter your choice book house: ");
            int num = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < bookingHouse.size(); j++) {
                if (num == j) {
                    String string = bookingHouse.get(j).getId() + coma + bookingHouse.get(j).getNameServices() + coma +
                            bookingHouse.get(j).getUseArea() + coma + bookingHouse.get(j).getRentalCosts() + coma +
                            bookingHouse.get(j).getPerson() + coma + bookingHouse.get(j).getRentType() + coma +
                            bookingHouse.get(j).getRoomStandard() + coma + bookingHouse.get(j).getOtherFacilities() +
                            coma + bookingHouse.get(j).getFloor() + coma + "\n";
                    writeFile(file_PATH_Booking, string);
                    bool = true;
                    break;
                } else if (j == bookingHouse.size() - 1) {
                    System.out.println("No house found");
                    bool = false;
                }
            }
        } while (!bool);
    }

    public static void addBookingRoom() {
        String file_PATH_Booking = "src\\case_study\\furama_resort\\data\\Booking.csv";
        boolean bool = true;
        List<Room> bookingroom = showAllRoom();
        do {
            System.out.print("Enter your choice book room: ");
            int num = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < bookingroom.size(); j++) {
                if (num == j) {
                    String string = bookingroom.get(j).getId() + coma + bookingroom.get(j).getNameServices() + coma +
                            bookingroom.get(j).getUseArea() + coma + bookingroom.get(j).getRentalCosts() + coma +
                            bookingroom.get(j).getPerson() + coma + bookingroom.get(j).getRentType() + coma +
                            bookingroom.get(j).getFreeServices() + coma + "\n";
                    writeFile(file_PATH_Booking, string);
                    bool = true;
                    break;
                } else if (j == bookingroom.size() - 1) {
                    System.out.println("No room found");
                    bool = false;
                }
            }
        } while (!bool);
    }

//      METHOD SHOW :-------------------------------------------------------------

    public static void showServices() {
        int choice = 0;
        while (choice != 8) {
            System.out.println("----------------");
            System.out.println("1.Show all Villa" +
                    "\n2.Show all House" +
                    "\n3.Show all Room" +
                    "\n4.Show All Name Villa Not Duplicate" +
                    "\n5.Show All Name House Not Duplicate" +
                    "\n6.Show All Name Room Not Duplicate" +
                    "\n7.Back to Menu" +
                    "\n8.Exit");
            System.out.print("Enter Your Choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showAllVila();
                    break;
                case 2:
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
                    break;
                case 4:
                    showAllVillaDuplicate();
                    break;
                case 5:
                    showAllHouseDuplicate();
                    break;
                case 6:
                    showAllRoomDuplicate();
                    break;
                case 7:
                    displayMainMenu();
                    break;
                case 8:
                    break;
            }
        }
    }



    public static List<Villa> showAllVila() {
        String file_PATH = "src\\case_study\\furama_resort\\data\\Villa.csv";
        String[] arrstr = readFile(file_PATH).split(",");
        List<Villa> villaList = new ArrayList<>();
        int i = 0;
        while (i < arrstr.length) {
            villaList.add(new Villa(arrstr[i], arrstr[i + 1], Double.parseDouble(arrstr[i + 2]), Double.parseDouble(arrstr[i + 3]),
                    Integer.parseInt(arrstr[i + 4]), arrstr[i + 5], arrstr[i + 6], arrstr[i + 7], Double.parseDouble(arrstr[i + 8]),
                    Integer.parseInt(arrstr[i + 9])));
            i += 10;
        }
        System.out.println();
        System.out.println("LIST OF VILLA : ");
        for (int j = 0; j < villaList.size(); j++) {
            System.out.print(j + ". ");
            villaList.get(j).showInfor();
            System.out.println("----------------");
        }
        return villaList;
    }

    public static List<House> showAllHouse() {
        String file_PATH = "src\\case_study\\furama_resort\\data\\House.csv";
        String[] arrstr = readFile(file_PATH).split(",");
        int i = 0;
        List<House> houseList = new ArrayList<>();
        while (i < arrstr.length) {
            houseList.add(new House(arrstr[i], arrstr[i + 1], Double.parseDouble(arrstr[i + 2]), Double.parseDouble(arrstr[i + 3]),
                    Integer.parseInt(arrstr[i + 4]), arrstr[i + 5], arrstr[i + 6], arrstr[i + 7], Integer.parseInt(arrstr[i + 8])));
            i += 9;
        }
        System.out.println();
        System.out.println("LIST OF HOUSE :");
        for (int j = 0; j < houseList.size(); j++) {
            System.out.print(j + ". ");
            houseList.get(j).showInfor();
            System.out.println("----------------");
        }
        return houseList;
    }

    public static List<Room> showAllRoom() {
        String file_PATH = "src\\case_study\\furama_resort\\data\\Room.csv";
        String[] arrstr = readFile(file_PATH).split(",");
        List<Room> roomList = new ArrayList<>();
        int i = 0;
        while (i < arrstr.length) {
            roomList.add(new Room(arrstr[i], arrstr[i + 1], Double.parseDouble(arrstr[i + 2]), Double.parseDouble(arrstr[i + 3]),
                    Integer.parseInt(arrstr[i + 4]), arrstr[i + 5], arrstr[i + 6]));
            i += 7;
        }
        System.out.println();
        System.out.println("LIST OF ROOM :");
        for (int j = 0; j < roomList.size(); j++) {
            System.out.print(j + ". ");
            roomList.get(j).showInfor();
            System.out.println("----------------");
        }
        return roomList;
    }

    public static void showAllVillaDuplicate() {
        String file_PATH = "src\\case_study\\furama_resort\\data\\Villa.csv";
        String[] arrstr = readFile(file_PATH).split(",");
        TreeSet<Villa> villaTreeSet = new TreeSet<>();
        int i = 0;
        while (i < arrstr.length) {
            villaTreeSet.add(new Villa(arrstr[i], arrstr[i + 1], Double.parseDouble(arrstr[i + 2]), Double.parseDouble(arrstr[i + 3]),
                    Integer.parseInt(arrstr[i + 4]), arrstr[i + 5], arrstr[i + 6], arrstr[i + 7], Double.parseDouble(arrstr[i + 8]),
                    Integer.parseInt(arrstr[i + 9])));
            i += 10;
        }
        System.out.println();
        System.out.println("LIST OF VILLA NOT DUPLICATE: ");
        for (Villa villa : villaTreeSet) {
            villa.showInfor();
        }
    }

    public static void showAllHouseDuplicate() {
        String file_PATH = "src\\case_study\\furama_resort\\data\\House.csv";
        String[] arrstr = readFile(file_PATH).split(",");
        int i = 0;
        TreeSet<House> houseTreeSet = new TreeSet<>();
        while (i < arrstr.length) {
            houseTreeSet.add(new House(arrstr[i], arrstr[i + 1], Double.parseDouble(arrstr[i + 2]), Double.parseDouble(arrstr[i + 3]),
                    Integer.parseInt(arrstr[i + 4]), arrstr[i + 5], arrstr[i + 6], arrstr[i + 7], Integer.parseInt(arrstr[i + 8])));
            i += 9;
        }
        System.out.println();
        System.out.println("LIST OF HOUSE NOT DUPLICATE:");
        for (House house : houseTreeSet) {
            house.showInfor();
        }
    }

    public static void showAllRoomDuplicate() {
        String file_PATH = "src\\case_study\\furama_resort\\data\\Room.csv";
        String[] arrstr = readFile(file_PATH).split(",");
        TreeSet<Room> roomTreeSet = new TreeSet<>();
        int i = 0;
        while (i < arrstr.length) {
            roomTreeSet.add(new Room(arrstr[i], arrstr[i + 1], Double.parseDouble(arrstr[i + 2]), Double.parseDouble(arrstr[i + 3]),
                    Integer.parseInt(arrstr[i + 4]), arrstr[i + 5], arrstr[i + 6]));
            i += 7;
        }
        System.out.println();
        System.out.println("LIST OF ROOM NOT DUPLICATE:");
        for (Room room : roomTreeSet) {
            room.showInfor();
        }
    }


    public static List<Customer> showInformationCustomer() {
        String file_PATH = "src\\case_study\\furama_resort\\data\\Customer.csv";
        String[] arrstr = readFile(file_PATH).split(",");
        List<Customer> customersList = new ArrayList<>();
        int i = 0;
        while (i < arrstr.length) {
            customersList.add(new Customer(arrstr[i], arrstr[i + 1], arrstr[i + 2], arrstr[i + 3],
                    Integer.parseInt(arrstr[i + 4]), arrstr[i + 5], arrstr[i + 6], arrstr[i + 7]));
            i += 8;
        }
        Collections.sort(customersList, new CompareCustomer());
        System.out.println();
        System.out.println("LIST OF CUSTOMER: ");
        for (int j = 0; j < customersList.size(); j++) {
            System.out.print(j + ". ");
            customersList.get(j).showInfor();
            System.out.println("----------------");
        }
        return customersList;
    }

    public static void showInformationOfEmployee() {
        String file_PATH = "src\\case_study\\furama_resort\\data\\Employee.csv";
        String[] arrstr = readFile(file_PATH).split(",");
        Map<Integer, Employee> employeeMap = new HashMap<>();
        int i = 0;
        int j = 1;
        while (i < arrstr.length) {
            employeeMap.put(j++, new Employee(arrstr[i], Integer.parseInt(arrstr[i + 1]), arrstr[i + 2]));
            i += 3;
        }
        System.out.println();
        System.out.println("LIST OF EMPLOYEE: ");
        for (Map.Entry<Integer, Employee> employee : employeeMap.entrySet()) {
            System.out.println(employee.toString());

        }
    }

    static Queue<Customer> customerQueue = new LinkedList<>();

    public static void showCinema() {
        List<Customer> customersList = showInformationCustomer();
        boolean bool = true;
        do {
            System.out.print("Enter your choice customer: ");
            int choice = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < customersList.size(); j++) {
                if (choice == j) {
                    customerQueue.add(customersList.get(j));
                    bool = true;
                    break;
                } else if (j == customersList.size() - 1) {
                    System.out.println("No customer found");
                    bool = false;
                }
            }
        } while (!bool);
        System.out.println(customerQueue.size());
        int size = customerQueue.size();
        if (customerQueue.size() == 5) {
            System.out.println("LIST OF CUSTOMER BOOK TICKET");
            for (int i = 0; i < size; i++) {
                customerQueue.remove().showInfor();
            }
        }
    }

    //   METHOD INPUT REGEX : ---------------------------------------------------------------------

    public static String inputGenderCustomer() {
        String regex = "(male|female|unknown)";
        String gender;
        while (true) {
            try {
                gender = scanner.nextLine();
                gender = gender.toLowerCase();
                if (!Pattern.matches(regex, gender)) {
                    throw new GenderException("No gender found" +
                            "\nEnter again: ");
                }
                break;
            } catch (GenderException e) {
                System.out.println(e.getMessage());
            }
        }
        return gender;
    }

    public static String inputIdCustomer() {
        String regex = "[\\d]{3} [\\d]{3} [\\d]{3}";
        String Id;
        while (true) {
            try {
                Id = scanner.nextLine();
                if (!Pattern.matches(regex, Id)) {
                    throw new IdCardException("The ID number must be in the format: xxx xxx xxx" +
                            "\nEnter again: ");
                }
                break;
            } catch (IdCardException e) {
                System.out.println(e.getMessage());
            }
        }
        return Id;
    }

    public static String inputBirthdayCustomer() {
        String regex = "[0-9]{2}/[0-9]{2}/(19[0-9][0-9]|20(00|01|02))";
        String birth;
        while (true) {
            try {
                birth = scanner.nextLine();
                if (!Pattern.matches(regex, birth)) {
                    throw new BirthdayException("The birthday must be in the format: xx/xx/xxxx" +
                            "\nEnter again: ");
                }
                break;
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
            }
        }
        return birth;
    }

    public static String inputEmailCustomer() {
        String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)";
        String mail;
        while (true) {
            try {
                mail = scanner.nextLine();
                if (!Pattern.matches(regex, mail)) {
                    throw new EmailException("The email must be in the format: abc@abc.abc" +
                            "\nEnter again: ");
                }
                break;
            } catch (EmailException e) {
                System.out.println(e.getMessage());
            }
        }
        return mail;
    }

    public static String inputNameCustomer() {
        String regex = "([A-Z]([a-z])* ?)+";
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                if (!Pattern.matches(regex, name)) {
                    throw new NameException("Your name must be in the format: Abc Abc" +
                            "\nEnter again: ");
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    public static String inputFreeServices() {
        String Regex = "(massage|karaoke|food|drink|car)";
        String freeService;
        do {
            freeService = scanner.nextLine();
            if (!Pattern.matches(Regex, freeService)) {
                System.out.println("No free services found");
                System.out.println("Enter again: ");
            }
        } while (!Pattern.matches(Regex, freeService));
        return freeService;
    }

    public static int inputNumFloor() {
        int num;
        boolean check = true;
        do {
            num = Integer.parseInt(scanner.nextLine());
            if (num < 0) {
                System.out.println("The floor number >= 0");
                System.out.println("Enter again: ");
                check = false;
            } else
                check = true;
        } while (!check);
        return num;
    }

    public static double inputRentalCost() {
        double num;
        boolean check = true;
        do {
            num = Double.parseDouble(scanner.nextLine());
            if (num < 0) {
                System.out.println("Rental cost > 0");
                System.out.println("Enter again: ");
                check = false;
            } else
                check = true;
        } while (!check);
        return num;
    }

    public static double inputArea() {
        double num;
        boolean check = true;
        do {
            num = Double.parseDouble(scanner.nextLine());
            if (num < 30) {
                System.out.println("The area > 30m2");
                System.out.println("Enter again: ");
                check = false;
            } else
                check = true;
        } while (!check);
        return num;
    }

    public static int numPerson() {
        int num;
        boolean check = true;
        do {
            num = Integer.parseInt(scanner.nextLine());
            if (num < 0 || num > 20) {
                check = false;
                System.out.println("The number > 0 or < 20");
                System.out.println("Enter again: ");
            } else
                check = true;
        } while (!check);
        return num;
    }

    public static String inputId() {
        String Regex = "SV(VL|HO|RO)-[\\d]{4}";
        String Id;
        do {
            Id = scanner.nextLine();
            if (!Pattern.matches(Regex, Id)) {
                System.out.println("The ID is not the correct format");
                System.out.println("Enter again: ");
            }
        } while (!Pattern.matches(Regex, Id));

        return Id;
    }

    public static String inputNameService() {
        String Regex = "[A-Z][a-z0-9\\s]*";
        String name;
        do {
            name = scanner.nextLine();
            if (!Pattern.matches(Regex, name)) {
                System.out.println("The name must be in the format: Abc1..");
                System.out.println("Enter again: ");
            }
        } while (!Pattern.matches(Regex, name));

        return name;
    }
    
    public static void main(String[] args) {
        displayMainMenu();
    }
}
