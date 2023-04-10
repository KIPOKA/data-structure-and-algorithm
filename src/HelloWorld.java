import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args) {

        HelloWorld demo = new HelloWorld();
        double now = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1: ");
//        int a = sc.nextInt();

        System.out.println(demo.findAverage(5 ));

        System.out.println("Time taken: "+ (System.currentTimeMillis() -now )  + " milliseconds.");
        System.out.println("---------------");
        System.out.println(demo.findSum(99999));

        System.out.println("Time taken: "+ (System.currentTimeMillis() -now )  + " milliseconds.");
        System.out.println("========= ARRAY ===========");
        int [] myArray ={2,0, 12, 0,8,2,9,5};
        printArray(myArray);
        System.out.println("========= DISPLAY BEFORE MANIPULATION ===========");
        removeEven(myArray);
        System.out.println("========= ODD NUMBERS ============");
        arrayDemo(myArray);
        System.out.println("========== RESERVE ===========");
        reserveArray(myArray, 0, myArray.length -1);
        printArray(myArray);
        System.out.println("========== MINIMUM VALUE ===========");
        int min  = findMinimum(myArray);
        System.out.println(min);


        System.out.println("========== Move zeroes at the end of the array ===========");
        moveZeroes(myArray, myArray.length);
        printArray(myArray);

        System.out.println("The size of the original array before resizing is: "+ myArray.length);;


        System.out.println("========== Resize the original array ===========");

        resize(myArray, 9);
        System.out.println("The size of the original array after resizing is: "+ myArray.length);;


    }
    //move all zeroes to the end of the array
    public static void moveZeroes(int[] arr, int n){
        int j=0;
        for (int i =0; i< n; i++){
            if (arr[i] != 0 && arr[j] ==0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
            if (arr[j] !=0){
                j++;
            }
        }

    }
    //Resize an array
    public static int[]  resize(int [] arr, int capacity){
        int temp[] = new int[capacity];
        for (int i=0; i<arr.length; i++){
            temp[i]= arr[i];
        }
        return temp;
    }

    //reverse an array
    public static void reserveArray(int numbers[], int start , int end){
        while (start< end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

    }
    //coding with love
    public int findAverage(int n){
        return n*(n+1)/2;
    }
    public static int findSum(int n){
        int sum= 0;
        for (int  i=0; i<=n; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void arrayDemo(int[] myArray){


        Arrays.sort(myArray);
        for (int i=0; i< myArray.length; i++){
            if (myArray[i] % 2 != 0){
                System.out.println(myArray[i]+ " ");
            }
        }

    }
    public static  void printArray(int []arr){
        for (int i=0; i< arr.length; i++){
                System.out.println(arr[i]+ " ");

        }
    }
    //getting the minimum value inside the array
    public static int findMinimum(int arr[]){
        int min = arr[0];
        for (int i =0; i<arr.length;i++){
            if (arr[i] < min ){
                min = arr[i];
            }
        }
        return min;
    }

    public static int [] removeEven(int [] arr){
        int oddCount =0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] %2 !=0){
                oddCount++;
            }
        }
        int result [] = new int[oddCount];
        int index =0;
        for (int i =0; i<result.length; i++){
            if (arr[i] %2 !=0){
                result[index] = arr[i];
                index++;
                System.out.println(result[i]);
            }
        }


        return result;
    }

}
