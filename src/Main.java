public class Main {
    public static void main(String[] args) {
        //t
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println();

        int b = 10;
        for (b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println();

        int friday = 1;
        while (friday < 30) {
            System.out.println("Сегодня пятница, " + friday + "-е число.Необходимо подготовить отчет.");
            friday = friday + 7;
        }
        System.out.println();
        /// задание 3
        int comet = 79;
        int year = 2022;
        int pastYears;
        pastYears = year - 200;
        for (int w = 0; w <= year + 100; w = w + comet) {
            if (w > pastYears) {
                System.out.println(w);


            }
        }
    }
}
