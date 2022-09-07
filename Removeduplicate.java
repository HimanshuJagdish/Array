public static int removeduplicates(int arr[], int n){
    if (n == 0 || n == 1) {
        return n;
    }
    //If not sorted use uncomment below
    //Arrays.sort(arr);  
    int j = 0;
    for ( int i = 0; i < n ; i++) {
        if (arr[i] != arr[i-1]) {
            arr[++j] = arr[i];
        }
    }
    return j;
}
