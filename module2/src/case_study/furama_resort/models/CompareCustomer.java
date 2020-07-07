package case_study.furama_resort.models;

import java.util.Comparator;

public class CompareCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        int value = o1.getNameCustomer().compareTo(o2.getNameCustomer());
        if (value != 0) {
            return value;
        } else {
            String[] str1 = o1.getBirthday().split("/");
            String[] str2 = o2.getBirthday().split("/");
            String yearCustomer1 = str1[2];
            String yearCustomer2 = str2[2];
            value = yearCustomer1.compareTo(yearCustomer2);
        }
        return value;
    }

}