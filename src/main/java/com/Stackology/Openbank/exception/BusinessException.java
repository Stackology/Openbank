package main.java.com.Stackology.Openbank.exception;
// Centralized exception handling
public class BusinessException {
    private String message;
    private String code;

    public BusinessException(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
