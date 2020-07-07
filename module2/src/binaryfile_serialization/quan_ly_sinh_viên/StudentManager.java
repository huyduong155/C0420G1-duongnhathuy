package binaryfile_serialization.quan_ly_sinh_viên;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    static final String Path="src\\binaryfile_serialization\\quan_ly_sinh_viên";
    static List<Student> list=new ArrayList<>();

    public static void read(String fileName){
        boolean bool= true;
        ObjectInputStream objectInputStream=null;
        try {
            objectInputStream =new ObjectInputStream(
                    new FileInputStream("src\\binaryfile_serialization\\quan_ly_sinh_viên\\"+fileName+".csv"));
            while (bool){
                Student student=(Student) objectInputStream.readObject();
                if (student!=null) {
                    list.add(student);
                }else
                    bool=false;
            }
            objectInputStream.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }


    public static void write(String fileName){
        ObjectOutputStream oos=null;
        try {
            oos =new ObjectOutputStream(
                    new FileOutputStream("src\\binaryfile_serialization\\quan_ly_sinh_viên\\"+fileName+".csv"));
            for (int i = 0; i <list.size() ; i++) {
                oos.writeObject(list.get(i));
            }
            oos.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }


    public static void addStudent(String fileName){
        File mk = new File(Path);
        mk.mkdir();
        File file = new File(Path,fileName+".csv");
        try {
            if (file.createNewFile()){
                System.out.println("File created..");
            }else
                System.out.println("\"File already exists..\"");
        } catch (IOException e) {
            e.printStackTrace();
        }
        read(fileName);
        Scanner scanner=new Scanner(System.in);
            int id=(list.size()>0)?(list.size()+1):1;
//        int id=Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sinh viên: ");
        String name=scanner.nextLine();
        System.out.print("Nhập tuổi sinh viên: ");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tỉnh: ");
        String city=scanner.nextLine();
        Student student=new Student(id,name,age,city);
        list.add(student);
    }


    public static void input(String fileName){
        write(fileName);
        list.clear();
    }

    public static void showStudent(String fileName){
        read(fileName);
        System.out.println();
        System.out.println("Danh sách sinh viên:");
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        list.clear();
        System.out.println();
    }


    public static void deleteStudent(String fileName){
        read(fileName);
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.print("Nhập Id sinh viên bạn muốn xóa: ");
        int Id=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).getId()==Id){
                list.remove(list.get(i));
            }else if (i==list.size()-1){
                System.out.println("id bạn nhập không có");
                deleteStudent(fileName);
            }
        }
        write(fileName);
        list.clear();
    }

    public static void editStudent(String fileName){
        read(fileName);
        String name;
        int age;
        String city;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Nhập id sinh viên bạn muốn sửa: ");
        int id=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <list.size() ; i++) {
            if (id==list.get(i).getId()){
                System.out.println("Nhập thông tin sinh viên mới:");
                System.out.print("Nhập tên: ");
                name=scanner.nextLine();
                System.out.print("Nhập tuổi: ");
                age=Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập tỉnh: ");
                city=scanner.nextLine();
                list.get(i).setName(name);
                list.get(i).setAge(age);
                list.get(i).setCity(city);
                write(fileName);
                list.clear();
                return;
            }else if (i==list.size()-1){
                System.out.println("id bạn nhập không có");
                editStudent(fileName);
            }
        }
    }


    public static void findStudent(String fileName){
        read(fileName);
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.print("Nhập id sinh viên bạn muốn tìm: ");
        int id=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <list.size() ; i++) {
            if (id==list.get(i).getId()){
                System.out.println("Sinh viên bạn muốn tìm là:\n"+list.get(i));
                return;
            }else if (i==list.size()-1){
                System.out.println("id bạn nhập không có");
                findStudent(fileName);
            }
        }
        list.clear();
    }

    public static void main(String[] args) {
        StudentManager studentManager=new StudentManager();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập tên file: ");
        String fileName=scanner.nextLine();
        int choice = 0;
        while (choice != 6) {
            System.out.println("------Student Manager------");
            System.out.println("1.Thêm sinh viên " +
                    "\n2.Hiển thị danh sách sinh viên " +
                    "\n3.Xóa sinh viên theo id" +
                    "\n4.Tìm sinh viên theo id"+
                    "\n5.Sửa thông tin sinh viên theo id"+
                    "\n6.Thoát");
            System.out.print("Nhập số bạn chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManager.addStudent(fileName);
                    System.out.println("Are you input this student: " + "\n1.yes" + "\t2.no");
                    int num = Integer.parseInt(scanner.nextLine());
                    switch (num) {
                        case 1:
                            studentManager.input(fileName);
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 2:
                    studentManager.showStudent(fileName);
                    break;
                case 3:
                    studentManager.deleteStudent(fileName);
                    break;
                case 4:
                    studentManager.findStudent(fileName);
                    break;
                case 5:
                    studentManager.editStudent(fileName);
                    break;
                case 6:
                    break;
            }
        }
    }
}
