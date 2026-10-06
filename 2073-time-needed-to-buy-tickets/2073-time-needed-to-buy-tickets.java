class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int seconds = 0;
        int target = tickets[k];
        
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                seconds += Math.min(tickets[i], target);
            } else {
                seconds += Math.min(tickets[i], target - 1);
            }
        }
        
        return seconds;
    }
}