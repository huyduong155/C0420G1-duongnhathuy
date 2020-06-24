package xu_ly_ngoai_le_debug.bai_tap;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập vào giá trị của cạnh: "+super.getMessage();
    }
}
