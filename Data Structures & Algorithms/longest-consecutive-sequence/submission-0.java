class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0)
            return 0;

        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
        }

        List<Integer> list = new ArrayList<>(set);

        int ans = 1;
        int curr = 1;

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) == list.get(i - 1) + 1) {
                curr++;
            } else {
                ans = Math.max(ans, curr);
                curr = 1;
            }
        }

        ans = Math.max(ans, curr);

        return ans;
    }
}