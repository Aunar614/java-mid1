package exception.basic.checked;

// Exception 을 상속 받은 예외는 체크 예외가 된다
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}
