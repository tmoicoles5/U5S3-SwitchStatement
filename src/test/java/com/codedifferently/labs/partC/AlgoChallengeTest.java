package com.codedifferently.labs.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partC.AlgoChallenge;

public class AlgoChallengeTest {
    // Problem 12
    @Test
    public void dogTroubleTest01(){

        // Given
        Boolean bulldog = true;
        Boolean lab = true;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.dogTrouble(bulldog, lab);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void dogTroubleTest02(){

        // Given
        Boolean bulldog = false;
        Boolean lab = false;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.dogTrouble(bulldog, lab);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void dogTroubleTest03(){

        // Given
        Boolean bulldog = true;
        Boolean lab = false;

        // When
        Boolean expected = false;
        Boolean actual = AlgoChallenge.dogTrouble(bulldog, lab);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 13
    @Test
    public void puppyCryTest01() {

        // Given
        Boolean cry = true;
        int time = 6;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.puppyCry(cry, time);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void puppyCryTest02() {

        // Given
        Boolean cry = true;
        int time = 7;

        // When
        Boolean expected = false;
        Boolean actual = AlgoChallenge.puppyCry(cry, time);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void puppyCryTest03() {

        // Given
        Boolean cry = false;
        int time = 6;

        // When
        Boolean expected = false;
        Boolean actual = AlgoChallenge.puppyCry(cry, time);

        // Then
        Assertions.assertEquals(expected, actual);
    }

}
