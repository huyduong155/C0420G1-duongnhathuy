package case_study.furama_resort.models;

public class BirthdayException extends Exception{
    public BirthdayException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập ngày tháng năm sinh: "+super.getMessage();
    }
}
