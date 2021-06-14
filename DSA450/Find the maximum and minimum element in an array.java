static void getMinMax(int arr[], int n) {
       
        int i;
  int max;
  int min;
 
        /*If there is only one element then return it as min and max both*/
        if (n == 1) {
            max = arr[0];
           min = arr[0];
            
        }
 
        /* If there are more than one elements, then initialize min
    and max*/
        if (arr[0] > arr[1]) {
            max = arr[0];
            min = arr[1];
        } else {
            max = arr[1];
           min = arr[0];
        }
 
        for (i = 2; i < n; i++) {
            if (arr[i] > max) {
              max = arr[i];
            } else if (arr[i] < min) {
               min = arr[i];
            }
        }
 
       
    }
