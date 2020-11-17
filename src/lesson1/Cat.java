package lesson1;

public class Cat implements Participants{
    private final int runDistance;
    private final int jumpHeight;

    public Cat(int runDistance, int jumpHeight) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {
        System.out.println("Кот успешно пробежал ");
    }

    @Override
    public void runFalse() {

    }

    @Override
    public String toString() {
        return "Cat{" + "runDistance=" + runDistance + ", jumpHeight=" + jumpHeight + '}';
    }

    public void catInfo(){
        System.out.println(this);
    }
}
