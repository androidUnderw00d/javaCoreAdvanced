package lesson1;

public interface Wall extends Obstacles {
    int heightWall = 4;

    default void wallInfo() {

    }

    /*Реализация для класса Wall*/
/*    @Override
    default String toString() {
        return "Wall{" + "heightWall=" + heightWall + '}';
    }*/
}
