import java.util.Scanner;

public class InsertionSort {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;
    int[] arr;
    int temp;
    int j;

    System.out.print("Enter the size of the array: ");
    n = input.nextInt();
    arr = new int[n];
    System.out.print("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    System.out.print("Enter 1 for ascending order, 2 for descending order: ");
    int choice = input.nextInt();
    switch (choice) {
      case 1:
        for (int i = 1; i < n; i++) {
          temp = arr[i];
          j = i - 1;
          while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            j = j - 1;
          }
          arr[j + 1] = temp;
        }
        break;
      case 2:
        for (int i = 1; i < n; i++) {
          temp = arr[i];
          j = i - 1;
          while (j >= 0 && arr[j] < temp) {
            arr[j + 1] = arr[j];
            j = j - 1;
          }
          arr[j + 1] = temp;
        }
        break;
      default:
        System.out.println("Invalid choice. Try again.");
    }

    System.out.println("The sorted array is:");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}