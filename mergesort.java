public class mergesort {
    public  int[] arr;

     public int[] ms(int[] arr, int s, int e){
        
        // base case : length of the array = 1
        if (e-s+1 <= 1){
            return arr;
        }

        // split the array in two
        int m = (s+e)/2;
        ms(arr, s, m);
        ms(arr, m+1, e);

        // Merge the arrays 
        merge(arr, s, m,e);

        return arr;
     }

     public void merge(int[] arr, int s, int m, int e){
        //separate the array into 2
        int n1 = m-s+1; //length of left array
        int n2 = e-m; //length of right array

        int[] left = new int[n1];
        int[] right = new int[n2];

        // copy the array data in left and right array
        for (int i = 0; i<n1;i++){
            left[i] = arr[s+i];
        }
        for (int i = 0; i<n2;i++){
            right[i] = arr[m+1+i];
        }

        // do the actual merging
        int top = s;
        int l = 0;
        int r = 0;
        while (l<n1 & r<n2){
            if (left[l]<right[r]){
                arr[top] = left[l];
                l+=1;
            }else{
                arr[top] = right[r];
                r++;
            }
            top++;
        }

        while (l<n1){
            arr[top] = left[l];
            l++;
            top++;
        }

        while (r<n2){
            arr[top] = right[r];
            r++;
            top++;
        }
     }
}