class Pair{
    int first,second;
    Pair(int f, int s){
        first=f;second=s;
    }
}

class Solution {

    public void bfs(int row,int col,char[][] grid,int[][] vis,int[] delRow,int[] delCol){
        vis[row][col]=1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(row,col));
        int n=grid.length;
        int m=grid[0].length;

        while(!q.isEmpty()){
            int ro=q.peek().first;
            int co=q.peek().second;
            q.remove();

            for(int i=0;i<4;i++){
                    int nrow=ro+delRow[i];
                    int ncol=co+delCol[i];

                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]=='1'){
                        vis[nrow][ncol]=1;
                        q.add(new Pair(nrow,ncol));
                    }
                
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int cnt=0;
        int []delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    cnt++;
                    bfs(i,j,grid,vis,delRow,delCol);
                }
            }
        }
        return cnt;
    }
}