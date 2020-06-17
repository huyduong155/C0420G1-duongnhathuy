package vongLapTrongJava.baiTap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
      int num;
      String text=" ";
      for (num=2;num<100;num++){
          int i = 2;
          boolean check = true;
          while (i <= Math.sqrt(num)) {
              if (num % i == 0) {
                  check = false;
                  break;
              }
              i++;
          }
          if (check){
              text=text+num+" ";
          }
      }
        System.out.println(text);
    }
}
