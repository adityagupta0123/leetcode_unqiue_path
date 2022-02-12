class Solution {
    public int uniquePaths(int m, int n) {
        // if(n ==1 || m ==1)
        //     return 1;
        // return uniquePaths(n-1,m) + uniquePaths(n,m-1);
        int UpperBound = m + n - 2; // (0,0) - (m-1,n-1) => (m - 1) + (n - 1) 
	    int lowerBound = m - 1; // LowerBound either m - 1 or n - 1
	    double paths = 1;
	    // Find the number of combinations of path
	    for(int i = 1; i <= lowerBound; i++) {
	    	paths = paths * (UpperBound - lowerBound + i) / i;
    	}
	
	    return (int)paths;
    }
}
