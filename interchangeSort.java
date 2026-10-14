public void interchangeSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if(arr[i] > arr[j]){
                // Swap hoan doi hai phan tu voi nhau
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}



void main() {
    int[] arr = {5,3,8,1,4};
    interchangeSort(arr);
    IO.println("Mảng sau khi sắp xếp:");
    for (int x:arr) {
        IO.print(x + " ");
    }
}
