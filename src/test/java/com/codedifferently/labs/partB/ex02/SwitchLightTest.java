package com.codedifferently.labs.partB.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex01.Switch;
import partB.ex01.IfLight;
import partB.ex02.SwitchLight;

public class SwitchLightTest {

    @Test
    public void switchTest01(){
        String expected = "Invalid color";
        String actual = SwitchLight.switchLight();
        Assertions.assertEquals(expected, actual);
    }
}
