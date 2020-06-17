package DSA_DanhSach.baiTap;

import java.util.Arrays;

public class TestMyList {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student=new Student(1,"huy");
        Student student1=new Student(2,"hai");
        Student student2=new Student(3,"hoang");
        Student student3=new Student(4,"gia");
        Student student4=new Student(5,"nam");
        Student student5=new Student(6,"trung");
        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyList = new MyList<>();
        studentMyList.add(student);
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
//        studentMyList.add(2,student5);
//        System.out.println(studentMyList.size());
//        System.out.println(studentMyList.get(3).getName());
//        System.out.println(studentMyList.indexOf(student5));
//        newMyList=studentMyList.clone();
//        for (int i=0;i<newMyList.size();i++){
//            System.out.println(newMyList.get(i).getName());
//        }
//        System.out.println(studentMyList.contain(student5));
        studentMyList.remove(2);
       for (int i=0;i<studentMyList.size();i++){
           System.out.println(studentMyList.get(i).getName());
       }
    }
}
