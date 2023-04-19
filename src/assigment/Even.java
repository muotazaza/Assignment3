package assigment;

public class Even {
    public static void main(String[] args) {
        int sum = 0;

        int sumWhile;
        for(int i = 0; i <= 100; i += 2) {
            System.out.println(sum += i);
        }




        sumWhile = 0;

        for(int j = 0; j <= 100; j += 2) {
            System.out.println(sumWhile += j);
        }

        int x = 0;
        int sumDoWhile = 0;

        do {
            System.out.println(sumDoWhile += x);
            x += 2;
        } while(x <= 100);

    }
}
