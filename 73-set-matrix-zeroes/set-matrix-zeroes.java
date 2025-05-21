class Pair{
    int row,col;
    public Pair(int r,int c){
        row=r;
        col=c;
    }
}

class Solution {
    public void setZeroes(int[][] matrix) {
        int rl=matrix.length;
        int cl=matrix[0].length;
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    q.add(new Pair(i,j));
                }
            }
        }
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            q.remove();
            for(int i=0;i<rl;i++){
                matrix[i][c]=0;
            }
            for(int i=0;i<cl;i++){
                matrix[r][i]=0;
            }
        }
    }
    
}