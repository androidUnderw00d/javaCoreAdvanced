package lesson2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {

    public MyArraySizeException(String errorMessage, Throwable e) {
        super(errorMessage);
    }

    public MyArraySizeException(String errorMessage) {
        super(errorMessage);
    }
}
