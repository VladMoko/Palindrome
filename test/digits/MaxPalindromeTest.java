package digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxPalindromeTest {

    @Test
    void isPalindrome() {
    MaxPalindrome max = new MaxPalindrome();
        assertEquals(true,max.isPalindrome());
    }
}