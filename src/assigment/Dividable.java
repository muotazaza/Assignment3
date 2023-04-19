package assigment;

public class Dividable {
    public static void main(String[] args) {


        int sum = 0;

        int sumWhlie;
        for (sumWhlie = 0; sumWhlie <= 100; ++sumWhlie) {
            if (sumWhlie % 7 == 0) {
                System.out.println(sum += sumWhlie);
            }
        }

        sumWhlie = 0;

        for (int j = 0; j <= 100; ++j) {
            if (j % 7 == 0) {
                System.out.println(sumWhlie += j);
            }
        }

        int x = 0;
        int sumDoWhile = 0;

        do {
            if (x % 7 == 0) {
                System.out.println(sumDoWhile += x);
            }

            ++x;
        } while (x <= 100);

    }
}
