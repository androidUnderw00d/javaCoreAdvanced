package lesson1;

public class Main {

    private static Object Objects;

    public static void main(String[] args) {

        Human man = new Human(40, 4);
        Cat cat = new Cat(20, 1);
        Robot robot = new Robot(60);

        System.out.println("В соревнованиях принимают участие претенденты:");
        man.manInfo();
        cat.catInfo();
        robot.robotInfo();
        System.out.println();

        System.out.println("Они должны преодолеть следующие препятствия:");
//        treadmil.treadmillInfo();
//        wall.wallInfo();
        System.out.println();


        /*Обойтись без массива из объектов*/
        Object[] challenger = {man, cat, robot};
//        Object[] let = {treadmil, wall};

        for (Object object : challenger) {
            if (object instanceof Runing) {
                    ((Runing) object).run();
            }
        }

    }

}
