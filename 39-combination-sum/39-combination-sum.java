class Solution {
 public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, candidates, target, new ArrayList<>(), 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] candidates, int target, List<Integer> prefix, int startAt) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(prefix));
        } else {
            for (int i = startAt; i < candidates.length; i++) {
                prefix.add(candidates[i]);
                // todo bug: do not start at i + 1, because we can reuse same elements
                backtrack(result, candidates, target - candidates[i], prefix, i);
                prefix.remove(prefix.size() - 1);
            }
        }
    }
}