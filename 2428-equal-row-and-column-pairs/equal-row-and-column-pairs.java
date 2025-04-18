class Solution {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> inner=new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                inner.add(grid[i][j]);
            }
            map.put(inner,map.getOrDefault(inner,0)+1);
        }
    int res=0;
        for(int i=0;i<grid.length;i++){
            List<Integer> inner=new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                inner.add(grid[j][i]);
            }
            if(map.containsKey(inner)){
                res+=map.get(inner);
            }
        }
        return res;
    }
}