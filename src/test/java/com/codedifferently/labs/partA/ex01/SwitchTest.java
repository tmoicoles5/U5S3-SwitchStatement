package com.codedifferently.labs.partA.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex01.Switch;

public class SwitchTest {
    @Test
    public void IndexingTest01(){
        String expected = "August";
        String actual = Switch.switchStatement();
        Assertions.assertEquals(expected, actual);
    }
}
