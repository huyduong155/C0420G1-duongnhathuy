package case_study.furama_resort.models;

import case_study.furama_resort.controllers.MainController;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class FileEmployee {
    public void findEmployee() {
        Scanner scanner = new Scanner(System.in);
        String file_PATH = "src\\case_study\\furama_resort\\data\\Employee.csv";
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
        String[] arrstr = String.valueOf(result).split(",");
        Stack<Employee> employeeStack = new Stack<>();
        int i = 0;
        while (i < arrstr.length) {
            employeeStack.push(new Employee(arrstr[i], Integer.parseInt(arrstr[i + 1]), arrstr[i + 2]));
            i += 3;
        }
        System.out.println();
        System.out.println("Enter the employee name you want to find: ");
        String name = scanner.nextLine();
        for (int k = 0; k < employeeStack.size(); k++) {
            if (name.equals(employeeStack.get(k).getNameEmployee())) {
                System.out.println(employeeStack.get(k));
            } else if (k == employeeStack.size() - 1) {
                System.out.println("No employee found");
            }
        }
    }
}
