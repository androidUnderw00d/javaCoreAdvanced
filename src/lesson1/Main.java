package lesson1;

import static lesson1.Treadmill.longTreadmill;
import static lesson1.Wall.heightWall;

public class Main {

    private static Object Objects;

    public static void main(String[] args) {

        Human man = new Human(40, 4);
        Cat cat = new Cat(20, 1);
        Robot robot = new Robot(60);

        Obstacles treadmill = null;
        Obstacles wall = null;



        System.out.println("В соревнованиях принимают участие претенденты:");
        man.manInfo();
        cat.catInfo();
        robot.robotInfo();
        System.out.println();

        System.out.println("Они должны преодолеть следующие препятствия:");
        System.out.println("Стену высотой " + heightWall);
        System.out.println("Длинна беговой дорожки " + longTreadmill);
        System.out.println();


        /*Обойтись без массива из объектов*/
//        Object[] challenger = {man, cat, robot};
//        Object[] let = {treadmil, wall};

/*        for (Object object : challenger) {
            if (object instanceof Runing) {
                ((Runing) object).run();
            }
        }*/

        Participants[] participant = {man, cat, robot};
        Obstacles[] obstacle = {wall, treadmill};
        for (Participants chalendger : participant) {
            /*if (runDistance <= longTreadmill )*/
            chalendger.run();
            chalendger.jump();
/*            if (chalendger instanceof Human){
                ((Human)chalendger).run();

            }*/
        }
    }

}
