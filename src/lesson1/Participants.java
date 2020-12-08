package lesson1;

public interface Participants extends Runing, Jumping {

    @Override
    default void jump() {

    }

    @Override
    default void run() {

    }

    @Override
    default void runFalse() {

    }


}
