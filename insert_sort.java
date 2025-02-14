public class insert_sort {
    public int[] insertsort(int[] arr){
        for(int j = 1 ; j < arr.length; j++){
            int i = j-1;
            while (i>=0 && arr[i+1] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i--;
            }
        }
        return arr;
    }

    public static void main (String [] args){
        int [] arr = {5,8,1,4,8};
        insert_sort solution = new insert_sort();
        int[] result = solution.insertsort(arr);
        for (int r : result){
            System.out.println(r);
        }
    }
}
