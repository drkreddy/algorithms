public class Sorts {
    public static void  heapify(int[] input, int n, int i){
        int largest = i;
        int left = 2*i;
        int right = 2*i+1;

        if(left<n && input[left] > input[largest]){
            largest = left;
        }
        if(right < n && input[right] > input[largest]){
            largest = right;
        }

        if( largest !=i){
            int temp = input[i];
            input[i] = input[largest];
            input[largest] = temp;
            heapify(input, n, largest);
        }
    }
}
