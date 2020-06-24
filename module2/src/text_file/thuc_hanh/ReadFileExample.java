package text_file.thuc_hanh;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            // Đọc file theo đường dẫn
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line="";
            int sum=0;
            while ((line=br.readLine())!=null){
                System.out.print(line+" ");
                sum+=Integer.parseInt(line);

            }
            br.close();
            System.out.println();
            System.out.println("tổng: "+sum);
        } catch (Exception e) {
            System.out.println("Fie không tồn tại or nội dung có lỗi!");;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập đường dẫn file: ");
        String path = scanner.nextLine();
//        E:\C0420G1-DUONGNHATHUY\C0420G1-duongnhathuy\module2\src\text_file\thuc_hanh\fileNumber.txt

        ReadFileExample readFileExample=new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
