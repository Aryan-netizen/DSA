class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int cols=0;
        int cole=matrix[0].length -1;
        int rows=0;
        int rowe=matrix.length -1;
        List<Integer> list = new ArrayList<>();
        while (rows<=rowe && cols<=cole){
            for (int i=cols;i<=cole;i++){
                list.add(matrix[rows][i]);
            }
            rows++;
            for (int i=rows;i<=rowe;i++){
                list.add(matrix[i][cole]);
            }
            cole--;
            if(rows<=rowe )
            for (int i=cole;i>=cols;i--){
                list.add(matrix[rowe][i]);
            }
            rowe--;
            if(cols<=cole)
            for (int i=rowe;i>=rows;i--){
                list.add(matrix[i][cols]);
            }
            cols++;

        }
        return list;
    }
}