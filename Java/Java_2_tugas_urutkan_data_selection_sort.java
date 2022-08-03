/*
    TUGAS :
    -> Algoritma Pemrograman

    Diberikan sebuah Array :
    { 100, 3, 71, 28, 14, 9, 10, 1, 33, 50 }

    Urutkan nilai yang ada didalam Array
    menggunakan sebuah Algoritma.

    Pengurutan nilai dapat dilakukan secara
    Ascending maupun Descending.
*/

class Java_2_tugas_urutkan_data_selection_sort {
    public static void main(String args[]) {
        int[] arr = { 100, 3, 71, 28, 14, 9, 10, 1, 33, 50 };
        int len = arr.length;

        // Menampilkan Nilai
        System.out.println("--------------------");
        System.out.println("-- Selection Sort --");
        System.out.println("--------------------");
        System.out.println("Data Awal : ");

        for(int i=0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

        // SELECTION SORT
        for(int A=0; A < len-1; A++) {
            // Mencari Index pada Nilai Terkecil
            int index_min = A;

            for(int i=A; i < len; i++) {
                if(arr[i] < arr[index_min]) {
                    index_min = i;
                }
            }
            // Menukarkan Nilai
            if(index_min != A) {
                int temp = arr[A];
                arr[A] = arr[index_min];
                arr[index_min] = temp;
            }
        }

        // Menampilkan Nilai
        System.out.println();
        System.out.println("Hasil Pengurutan Data : ");
        for(int i=0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
