class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int index = 0;
        
        Map<Integer, List<Integer>> diagonalMap = new HashMap<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = i + j;
                List<Integer> diagonal = diagonalMap.getOrDefault(sum, new ArrayList<>());
                diagonal.add(mat[i][j]);
                diagonalMap.put(sum, diagonal);
            }
        }
        
        for (int i = 0; i < m + n - 1; i++) {
            List<Integer> diagonal = diagonalMap.get(i);
            if (diagonal != null) {
                if (i % 2 == 0) {
                    Collections.reverse(diagonal);
                }
                for (int num : diagonal) {
                    result[index++] = num;
                }
            }
        }
        
        return result;
 
    }
}
