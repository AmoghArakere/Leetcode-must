class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[101]; // Assuming the numbers range from 0 to 100
        int maxFreq = 0;
        int total = 0;

        for (int num : nums) {
            count[num]++;
            int freq = count[num];

            if (freq > maxFreq) {
                maxFreq = freq;
                total = maxFreq; // Reset total to the new max frequency
            } else if (freq == maxFreq) {
                total += maxFreq; // Add to total if freq equals maxFreq
            }
        }

        return total;
   
    }
}
