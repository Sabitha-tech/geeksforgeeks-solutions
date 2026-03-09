class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i = 1; i < s.length(); i++)
        {
            int diff = s.charAt(i) - s.charAt(i - 1);
            if(diff < 0)
                diff = -diff;
            score = score + diff;
        }
        return score;
    }
}
