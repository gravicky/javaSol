
	class Solution {
	public int[][] merge(int[][] intervals) {
		if (intervals.length <= 1)
			return intervals;
		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0],i2[0]));

		List<int[]> result = new ArrayList<>();
		int[] oldInterval = intervals[0];
        int m=intervals.length,i=1;
		while(i<m) 
        {
			if (intervals[i][0] <= oldInterval[1]){
				oldInterval[1] = Math.max(oldInterval[1], intervals[i][1]);
                i++;
            }
			else {                             // Disjoint intervals, add the new interval to the list
				result.add(oldInterval);
                oldInterval = intervals[i];
                i++;				
			}
		}
        result.add(oldInterval);

		return result.toArray(new int[result.size()][]);
	}
}
