package lesson2;

public class MyArrayDataException extends NumberFormatException {

    public MyArrayDataException(String errorMessage, Throwable e) {
        super(errorMessage);
//        e.printStackTrace();
    }
}
