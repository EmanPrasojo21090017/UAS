package UAS;

import QuickSort.QuickSort;

import java.util.Scanner;

public class pizza {
    static Scanner in = new Scanner(System.in);
    private int[] data;
    public pizza(int[] data) {
        this.data = data;
        this.QuickSortAscending();
        this.QuickSortDescending();
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Pilih : ");
        int pilih = in.nextInt();
        switch (pilih) {
            case 1:
                QuickSortAscending();
                break;
            case 2:
                QuickSortDescending();
                break;
        }
    }
    public void QuickSortAscending() {
        System.out.println("Sebelum : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("Sesudah : ");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
    public void QuickSortDescending() {
        System.out.println("Sebelum : ");
    }

    public static void main(String[] args) {
        String[] dataArray = {"Pizza"};
        int n = dataArray.length;
        System.out.println("""
                Before sorting array elements are -\s""");
        QuickSort _myQS = new QuickSort();
        _myQS.setData(dataArray);
        _myQS.printArr(n);
        _myQS.quickSort(0, n-1);
        System.out.println("\n After sorting array elements are - ");
        _myQS.printArr(n);
        System.out.println();
    }
}
