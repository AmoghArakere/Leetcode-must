class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;
        String a = s.substring(0, mid);
        String b = s.substring(mid, n);

        int vowelCountA = countVowels(a);
        int vowelCountB = countVowels(b);

        return vowelCountA == vowelCountB;
    }

    private int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;  
    }
}
