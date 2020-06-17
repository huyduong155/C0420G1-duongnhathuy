package DSA_DanhSach.baiTap;

public class TestMyLinkedList {

    public static void main(String[] args) {
        class Student1 {
            private int id;
            private String name;

            public Student1() {
            }

            public Student1(int id, String name) {
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
        MyLinkedList<Student1> studentMyLinkedList = new MyLinkedList<>();
        Student1 student1 = new Student1(1, "huy");
        Student1 student2 = new Student1(2, "hong");
        Student1 student3 = new Student1(3, "trung");
        Student1 student4 = new Student1(4, "nam");
        Student1 student5 = new Student1(4, "ngo");
        studentMyLinkedList.addFirst(student1);
        studentMyLinkedList.addFirst(student2);
        studentMyLinkedList.addFirst(student3);
//        studentMyLinkedList.add(student3, 2);
//        studentMyLinkedList.remove(student1);

//        System.out.println(studentMyLinkedList.indexOf(student4));
//     studentMyLinkedList.clear();
     for (int i=0;i<studentMyLinkedList.size();i++){
         Student1 student= (Student1) studentMyLinkedList.get(i);
         System.out.println(student.getName());
     }
//        System.out.println( studentMyLinkedList.getLast().getName());
//     studentMyLinkedList.remove(student3);

//        MyLinkedList<Student1> newMylinkedList = studentMyLinkedList.clone();
//        for (int i = 0; i < newMylinkedList.size(); i++) {
//            Student1 student = (Student1) newMylinkedList.get(i);
//            System.out.println(student.getName());
//        }

    }
}
