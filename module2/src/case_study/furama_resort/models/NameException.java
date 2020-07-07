package case_study.furama_resort.models;

public class NameException extends Exception{
    public NameException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Enter name error: "+super.getMessage();
    }
}
