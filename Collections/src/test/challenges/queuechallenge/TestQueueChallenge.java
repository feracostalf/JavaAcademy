package test.challenges.queuechallenge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import challenges.queuechallenge.QueueChallenge;

public class TestQueueChallenge {

    static QueueChallenge queuechallenge= new QueueChallenge();

    @ParameterizedTest
    @ValueSource(strings={"civic","racecar","ana","abba"})
    void isPalindrome(String word){
        assertTrue(queuechallenge.isPalindrome(word));
    }

    @ParameterizedTest
    @ValueSource(strings={"Luis","Fernando","Acosta","Enriquez"})
    void isNotPalindrome(String word){
        assertEquals(false,queuechallenge.isPalindrome(word));
    }


    
}
