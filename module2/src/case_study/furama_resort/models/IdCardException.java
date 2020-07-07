package case_study.furama_resort.models;

public class IdCardException extends Exception{
    public IdCardException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Enter ID error: "+super.getMessage();
    }
}
