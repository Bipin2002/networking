
public class Array4 {


    public static void main(String[] args) {
        int [] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Array given in input is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--)
            arr[i] = arr[i - 1];

        arr[0] = temp;

        System.out.println();
        System.out.println("Array after rotation is:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
