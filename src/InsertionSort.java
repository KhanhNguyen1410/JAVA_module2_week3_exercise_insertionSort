import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter list size ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("enter values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("your input: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "  ");
        }
        insertionSort(list);
        System.out.println("after sort");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "");
        }
    }

    static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            System.out.println("bien tam luu gia tri can chen" + currentElement);
            int j;
            System.out.println("vi tri cua phan tu so sanh" + i);
            System.out.println("so sanh cac phan tu truoc currentValue");
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
                System.out.println("lui " + list[j] + "sang " + list[j + 1]);
            }
            System.out.println("gan vi tri con trong cho current");
            list[j + 1] = currentElement;
        }
    }
}
