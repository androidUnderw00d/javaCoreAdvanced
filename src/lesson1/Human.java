package lesson1;

public class Human implements Participants {
    private final int runDistance;
    private final int jumpHeight;
    private Object longTreadmill;

    public Human(int runDistance, int jumpHeight) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
//        if (runDistance <= longTreadmill)
        System.out.println("Человек успешно пробежал ");

    }

    @Override
    public void runFalse() {

    }

    @Override
    public void jump() {
        System.out.println("Человек успешно перепрыгнул препятствие ");
    }

    @Override
    public void jumpFalse() {

    }


    @Override
    public String toString() {
        return "Man{" + "runDistance=" + runDistance + ", jumpHeight=" + jumpHeight + '}';
    }

    public void manInfo() {
        System.out.println(this);
    }
}
