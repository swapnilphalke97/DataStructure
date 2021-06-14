 static void rvereseArray(int arr[], int start, int end)
    {
        int t;
        if (start >= end)
            return;
        t = arr[start];
        arr[start] = arr[end];
        arr[end] = t;
        rvereseArray(arr, start+1, end-1);
    }
