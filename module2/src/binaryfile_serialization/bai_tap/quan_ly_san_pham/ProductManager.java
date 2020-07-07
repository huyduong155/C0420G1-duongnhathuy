package binaryfile_serialization.bai_tap.quan_ly_san_pham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static final String PATH = "src\\binaryfile_serialization\\bai_tap\\quan_ly_san_pham";
    static List<Product> list = new ArrayList<>();
    static List<Product> listShow = new ArrayList<>();

    public static void add() {
        File mk = new File(PATH);
        mk.mkdir();
        File file = new File(PATH, "product_manager.csv");
        try {
            if (file.createNewFile()) {
                System.out.println("\"File created..\"");
            } else
                System.out.println("File already exists..");
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean bool = true;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("product_manager.csv"));
            while (bool) {
                Product product = (Product) objectInputStream.readObject();
                if (product != null) {
                    list.add(product);
                    System.out.println("abc");
                } else
                    bool = false;
            }
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println("bcd");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập thông tin khác: ");
        String other = scanner.nextLine();
        Product product = new Product(id, name, manufacturer, price, other);
        list.add(product);
    }


    public static void input() {

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream("product_manager.csv"));
            for (int i = 0; i < list.size(); i++) {
                oos.writeObject(list.get(i));
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.clear();
        System.out.println();
    }


    public static void show() {
        boolean bool = true;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("product_manager.csv"));
            while (bool) {
                Product product = (Product) objectInputStream.readObject();
                if (product != null) {
                    listShow.add(product);
                } else
                    bool = false;
            }
        } catch (Exception e) {
            e.getMessage();

        }
        boolean needNextPass = true;
        for (int k = 1; k < listShow.size() && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < listShow.size() - k; i++) {
                if (listShow.get(i).getId() > listShow.get(i + 1).getId()) {
                    Product temp = listShow.get(i);
                    listShow.set(i, listShow.get(i + 1));
                    listShow.set(i + 1, temp);
                    needNextPass = true;
                }
            }
        }

        System.out.println();
        System.out.println("Danh sách sản phẩm:");
        for (int i = 0; i < listShow.size(); i++) {
            System.out.println(listShow.get(i));
        }
        System.out.println();
    }


    public static void find() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Nhập tên sản phẩm bạn muốn tìm: ");
        String name = scanner.nextLine();
        for (int i = 0; i < listShow.size(); i++) {
            if (name.equals(listShow.get(i).getName())) {
                System.out.println("Sản phẩm bạn muốn tìm là: " + "\n" + listShow.get(i) + "\n");
                return;
            } else if (i == listShow.size() - 1) {
                System.out.println("Tên sản phẩm bạn nhập không có" + "\n");
            }
        }
    }


    public static void main(String[] args) {
        ProductManager pro = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("------Product Manager------");
            System.out.println("1.Thêm sản phẩm " +
                    "\n2.Hiển thị danh sách sản phẩm " +
                    "\n3.Tìm kiếm sản phẩm" +
                    "\n4.Thoát");
            System.out.print("Nhập số bạn chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    pro.add();
                    System.out.println("Are you input this product: " + "\n1.yes" + "\t2.no");
                    int num = Integer.parseInt(scanner.nextLine());
                    switch (num) {
                        case 1:
                            pro.input();
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 2:

                    pro.show();
                    break;
                case 3:
                    pro.find();
                    break;
                case 4:
                    break;

            }
        }
    }
}
