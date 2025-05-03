class Solution {
    class Pair {
        int row, col, tm;

        public Pair(int r, int c, int t) {
            row = r;
            col = c;
            tm = t;
        }
    }

    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] vis = new int[n][m];
        int[][] dis = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = 1;
                } else
                    vis[i][j] = 0;
            }
        }
        int[] delRow = { -1, 0, 1, 0 };
        int[] delCol = { 0, 1, 0, -1 };

        while(!q.isEmpty()){
            int row=q.peek().row;
            int col=q.peek().col;
            int step=q.peek().tm;
            q.remove();
            dis[row][col]=step;

            for(int i=0;i<4;i++){
                int nrow=row+delRow[i];
                int ncol=col+delCol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 ){
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol,step+1));
                }
            }
        }
        return dis;
    }
}