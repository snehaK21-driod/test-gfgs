class Solution {
    public int maxPerimeter(int[] arr) {
        // code here
        Arrays.sort(arr);
        for(int i =arr.length-1;i>=2;i--){
            int a=arr[i];
            int b=arr[i-1];
            int c=arr[i-2];
            if(b+c>a){
                return a+b+c;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={6,1,6,5,8,4};
        Solution sol=new Solution();
        System.out.println("Maximum perimeter: " + sol.maxPerimeter(arr));
    }
}