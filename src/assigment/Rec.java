package assigment;

public class Rec {
    public static void main(String[] args) {

        int evenSum = calculateEvenSum(0);
        System.out.println("SumOFEven   = " + evenSum);

        int oddSum =calculateOddSum(1);
        System.out.println("SumOFOdd   = " + oddSum);

        int sumOfDivByseven = calculateModSeven(0) ;
        System.out.println("SumDivBySeven   = " + sumOfDivByseven);


    }

    public static int calculateModSeven (int j ){
        if ( j>100) {
            return 0;

        }
        if (j % 7 == 0) {
           return j + calculateModSeven(j+1);
        }

        return calculateModSeven(j+1)  ;

    }
    public static int calculateEvenSum(int n) {
        if (n > 100) {
            return 0;
        }
        if (n % 2 != 0) {
            n++;
        }

        return n + calculateEvenSum(n + 2);
    }
    public static int calculateOddSum(int x){
        if (x >= 100) {
            return 0;

        }
        if (x % 2 == 0) {
            x++;
        }
        return x+calculateOddSum(x+2);
    }

    }

