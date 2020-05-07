package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void emptyTestTwo() {
        assertEquals(false, false);
    }

    @Test
    public void launchCodeTest() {
        assertEquals("[LaunchCode]", "[LaunchCode]");
    }

    @Test
    public void launchCodeTestTwo() { assertEquals("[LaunchCode", "[LaunchCode");
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsWithWordsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[words]"));
    }

    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void oneBracketWithWordReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[word"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void threeBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]Code["));
    }

    @Test
    public void numberWithBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[3]"));
    }

    @Test
    public void CurlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{ }"));
    }
}