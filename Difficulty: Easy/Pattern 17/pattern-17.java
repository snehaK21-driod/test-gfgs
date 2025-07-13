class Solution {

    void printTriangle(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
        
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            
            for (int ch = 0; ch < i; ch++) {
                System.out.print((char)('A' + ch));
            }

            
            for (int ch = i - 2; ch >= 0; ch--) {
                System.out.print((char)('A' + ch));
            }

            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4; 
        Solution obj = new Solution();
        obj.printTriangle(n);
    }
}

    
