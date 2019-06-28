import jdk.nashorn.internal.runtime.GlobalFunctions;

import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10,4,6,7,8,9,5,1,3,2};
        show(array);
        System.out.println("\nEnter the insertion position: ");
        int position = scanner.nextInt();
        System.out.println("Enter an element to insert into the array: ");
        int newValue = scanner.nextInt();
        int[] newArray = inserted(array, position, newValue);
        System.out.print("Array after inserted: ");
        show(newArray);

    }

    public static int[] inserted(int[] arr, int position, int newValue) {
        int n = arr.length;
        int[] newArray = new int[n+1];
        if (position >= 0 && position <= n) {

            for (int i = n; i > position; i--) {
                newArray[i] = arr[i - 1];
            }
            newArray[position] = newValue;
            for (int j = position; j >= 0; j--) {
                newArray[j] = arr[j];
            }
            newArray[position] = newValue;
        }

        return newArray;
    }

    public static void show(int [] arr) {
        System.out.print("Array List: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " \t");
        }
    }

}
