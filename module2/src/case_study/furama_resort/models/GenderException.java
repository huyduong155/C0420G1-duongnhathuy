package case_study.furama_resort.models;

public class GenderException extends Exception {
    public GenderException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Enter gender error: "+super.getMessage();
    }
}
