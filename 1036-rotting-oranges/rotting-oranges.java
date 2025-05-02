        class Solution {

    class Pair {
        int r;
        int c;
        int t;

        Pair(int r, int c, int t) {
            this.r = r;
            this.c = c;
            this.t = t;
        }
    }

    public int orangesRotting(int[][] grid) {

        int m = grid.length, n = grid[0].length;

        // dfs
        Queue<Pair> q = new LinkedList<>();
        int freshCount = 0;

        // level 1 rotten oranges
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // rotton
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                }
                else if(grid[i][j] == 1) {
                    freshCount ++;
                }
            }
        }

        int[] rows = { -1, 0, 1, 0 };
        int[] cols = { 0, 1, 0, -1 };

        int time = 0;
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int row = p.r;
            int col = p.c;
            int t = p.t;

            // to track the correct time
            time = Math.max(time, t);

            for(int i = 0; i < 4; i++)
            {
                int r = rows[i] + row;
                int c = cols[i] + col;

                if(r >= 0 && r < m && c >= 0 && c < n)
                {
                    if(grid[r][c] == 1)
                    {
                        // make fresh to rotten
                        grid[r][c] = 2;
                        q.add(new Pair(r, c, t + 1));
                        freshCount --;
                    }
                }
            }
        }

        return freshCount != 0? -1 : time;
    }
}