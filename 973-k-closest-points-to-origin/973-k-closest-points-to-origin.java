class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>(new Comparator<int[]>(){
           public int compare(int[] left,int[] right){
               return right[0]*right[0]-left[0]*left[0]+right[1]*right[1]-left[1]*left[1];
           } 
        });
        for (int[] point: points) {
            heap.add(point);
            if (heap.size() > k)
                heap.poll();
        }
        int[][] result = new int[k][2];
        while (k > 0)
            result[--k] = heap.poll();
        
        return result;
    }
    
}