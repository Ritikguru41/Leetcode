class Solution {
    public int[] twoSum(int[] n, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n.length; i++) {
            int needed = target - n[i];

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            map.put(n[i], i);
        }

        return new int[]{-1, -1};
    }
}