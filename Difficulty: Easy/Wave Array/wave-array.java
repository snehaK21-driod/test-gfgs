import java.util.Arrays;  

class Solution {
    public void sortInWave(int arr[]) {
        Arrays.sort(arr); 
        int n = arr.length;

        // Swap adjacent elements in pairs
        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Solution sol = new Solution();     
        sol.sortInWave(arr);               

        System.out.println("Wave Array: " + Arrays.toString(arr));
    }
}
