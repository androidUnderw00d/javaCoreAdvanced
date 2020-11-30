package lesson5;

public class HomeWork {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    static long a;
    static float[] arr = new float[SIZE];

    public static void main(String[] args) {


        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

//        System.arraycopy(arr, 0, a1, 0, HALF);
//        System.arraycopy(arr, HALF, a2, 0, HALF);

        dividingArray(a1, a2);

        withOutThread();

        useTread(a1, a2);

        glueArrays(a1, a2);

    }

    private static void withOutThread() {

        a = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Время первого метода : " + (System.currentTimeMillis() - a));

//        Для проверки корректности работы
//        System.out.println(arr[0] + " : " + arr[HALF - 1] + " : " + arr[HALF] + " : " + arr[SIZE-1]);
//        System.out.println(Arrays.toString(arr));

    }

    private static void useTread(float[] a1, float[] a2) {

        Thread t1 = new Thread(() -> {

            a = System.currentTimeMillis();

            for (int i = 0; i < HALF; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }

            System.out.println("Время первого потока : " + (System.currentTimeMillis() - a));

//            Для проверки корректности работы
//            System.out.println(a1[0] + " : " + a1[HALF - 1]);

        });

//        Показывает выигрыш во времени при параллельной обработке
        Thread t2 = new Thread(() -> {
            a = System.currentTimeMillis();

            for (int i = 0; i < HALF; i++) {
                a2[(i)] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }

            System.out.println("Время второго потока : " + (System.currentTimeMillis() - a));
//            Для проверки корректности работы
//            System.out.println(a2[0] + " : " + a2[HALF - 1]);

        });

//        Вычисляет верный значения при параллельной работе
        Thread t3 = new Thread(() -> {
            a = System.currentTimeMillis();

            for (int i = 0; i < HALF; i++) {
                int j = i + HALF;
                a2[(i)] = (float) (a2[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
            }

            System.out.println("Время второго потока : " + (System.currentTimeMillis() - a));
//            Для проверки корректности работы
            System.out.println(a2[0] + " : " + a2[HALF - 1]);

        });

        t1.start();
        t2.start();

//         Дождаться завершения работы потоков чтобы корректно сложить итоговый массив

/*        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    private static void dividingArray(float[] a1, float[] a2) {
        a = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);
        System.currentTimeMillis();
//        System.out.println("Время деления массива на два : " + (System.currentTimeMillis() - a));
    }


    public static void glueArrays(float[] a1, float[] a2) {

        a = System.currentTimeMillis();

        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);
        System.out.println("Время склейки массива : " + (System.currentTimeMillis() - a));

//        Для проверки корректности работы
//        System.out.println(arr[0] + " : " + arr[HALF - 1] + " : " + arr[HALF] + " : " + arr[SIZE-1]);

    }
}
