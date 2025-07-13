class Solution {

    void printTriangle(int n) {
        // code here
        
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=5;
        Solution obj = new Solution();
        obj.printTriangle(n);
    }
}
    
