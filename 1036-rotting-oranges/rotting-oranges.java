class Pair{
    int first,second,tm;
    public Pair(int f, int s, int t){
        first=f;second=s;tm=t;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        Queue<Pair> q=new LinkedList<>();
        int cntFresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    vis[i][j]=2;
                    q.add(new Pair(i,j,0));
                }else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1) cntFresh++;
            }
        }
        int cnt=0;
        int tm=0;
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};
        while(!q.isEmpty()){
            int r=q.peek().first;
            int c=q.peek().second;
            int t=q.peek().tm;
            q.remove();
            tm=Math.max(t,tm);
            for(int i=0;i<4;i++){
                int ro=r+delRow[i];
                int co=c+delCol[i];
                if(ro>=0 && ro<n && co>=0 && co<m && vis[ro][co]==0 && grid[ro][co]==1){
                    q.add(new Pair(ro,co,t+1));
                    vis[ro][co]=2;
                    cnt++;
                }
            }
        }
        if(cnt!=cntFresh) return -1;
        return tm;
    }
}