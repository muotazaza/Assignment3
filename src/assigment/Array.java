package assigment;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] arr={3,5,6,-1,9,8,1,7,0};

        System.out.println("minValue(arr) = " + minValue(arr));
        System.out.println("maxValue = " + maxValue(arr));
        System.out.println("avgOfArray = " + avgOfArray(arr));
        System.out.println("sorted = " + Arrays.toString( sorted(arr)));
    }
   public static int  minValue(int arr[]){
        int min;
       min = arr[0];
       for (int i = 1; i <arr.length ; i++) {

           if (arr[i] <min) {
               min=arr[i];

           }
       }

       return min;
   }
    public static int  maxValue(int arr[]){
        int max;
        max = arr[0];
        for (int i = 1; i <arr.length ; i++) {

            if (arr[i] > max) {
                max=arr[i];

            }
        }

        return max;
    }
    public static double avgOfArray (int arr[]){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];


        }
        return (double) sum/arr.length;
    }
    public static int[]  sorted (int[] arr) {
    int [] sor=arr.clone();
        Arrays.sort(sor);

        return sor;
    }


    }
