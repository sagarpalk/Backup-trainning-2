package customeExceptionExample2;

public class Balance extends RuntimeException {
 
    private String message;
 
    public void InSufficientFundException(String message) {
        this.message = message;
    }
 
    public void InSufficientFundException(Throwable cause, String message) {
        
        this.message = message;
    }
 
    public String getMessage() {
        return message;
    }
 
}