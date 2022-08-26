class Solution {
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        int[] start = new int[len];
        int[] end = new int[len];
        for(int i=0;i<len;i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int st=0,en=0;
        List<int[]> list = new ArrayList<>();
        while(en<len){
            if(en==len-1 || end[en]<start[en+1]){
                list.add(new int[]{start[st],end[en]});
                st = en+1;       
            }
            en++;
        }
        return list.toArray(new int[list.size()][]);   
    }
}