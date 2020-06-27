package text_file.bai_tap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountryList {
    public static void main(String[] args) {
        String File="src/text_file/bai_tap/country_list.txt";
        String Line="";
        try {
            BufferedReader br =new BufferedReader(new FileReader(File));
            while ((Line=br.readLine())!=null){
                String[] str=Line.split(",");
                System.out.println(str[4]+str[5]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
