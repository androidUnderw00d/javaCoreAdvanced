package lesson1;

public interface Treadmill extends Obstacles {
    int longTreadmill = 30;

    default void treadmillInfo() {

        System.out.println("Длинна беговой дорожки " + longTreadmill);
    }

    /*Реализация для класса Treadmill. Абстрактные методы, не должны иметь реализации*/
/*    public int getLongTreadmill() {
        return longTreadmill;
    }

    @Override
    public String toString() {
        return "Treadmill{" + "longTreadmill=" + longTreadmill + '}';
    }*/
}
