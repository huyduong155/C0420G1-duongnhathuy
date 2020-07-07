package case_study.furama_resort.models;

public class EmailException extends Exception{
    public EmailException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Enter mail error: "+super.getMessage();
    }
}
