package lesson1;

public class Robot implements Runing {
    private final int runDistance;
//    private final int jumpHeight;

    public Robot(int runDistance, int jumpHeight) {
        this.runDistance = runDistance;
//        this.jumpHeight = jumpHeight;
    }

    public Robot(int runDistance) {
        this.runDistance = runDistance;
    }

    @Override
    public void run() {
        System.out.println("Робот успешно пробежал ");
    }

    @Override
    public void runFalse() {

    }

    @Override
    public String toString() {
        return "Robot{" + "runDistance=" + runDistance + ", к сожалению робот слишком тяжел для прыжков" + '}';
    }

    public void robotInfo() {
        System.out.println(this);
    }
}
