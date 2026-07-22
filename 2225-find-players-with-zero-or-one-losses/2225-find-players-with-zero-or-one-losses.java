class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        HashMap<Integer, Integer> losses = new HashMap<>();
        HashSet<Integer> players = new HashSet<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            players.add(winner);
            players.add(loser);

            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for (int player : players) {
            int lossCount = losses.getOrDefault(player, 0);

            if (lossCount == 0) {
                zeroLoss.add(player);
            } else if (lossCount == 1) {
                oneLoss.add(player);
            }
        }

        Collections.sort(zeroLoss);
        Collections.sort(oneLoss);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(zeroLoss);
        ans.add(oneLoss);

        return ans;
    }
}