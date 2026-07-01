class Solution {
    public boolean isPalindrome(int x) {
           // Numbers ending with 0 are not palindrome (except 0)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rev = 0;

        while (x > rev) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }

        // For even digits: x == reversed
        // For odd digits: x == reversed / 10
        return (x == rev|| x == rev / 10);

    }
}