package assigment;

public class Odd {
    public static void main(String[] args) {
        int sum = 0;

        int sumWhile;
        for(sumWhile = 1; sumWhile <= 100; sumWhile += 2) {
            System.out.println(sum += sumWhile);
        }

        sumWhile = 0;

        for(int j = 1; j <= 100; j += 2) {
            System.out.println(sumWhile += j);
        }

        int sumDoWhile = 0;
        int x = 1;

        do {
            System.out.println(sumDoWhile += x);
            x += 2;
        } while(x <= 100);

    }
}
