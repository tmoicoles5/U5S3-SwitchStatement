package com.codedifferently.labs.partB.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex01.Switch;
import partB.ex01.IfLight;

public class IfLightTest {
    @Test
    public void LightTest01(){
        String expected = "Next Traffic Light is green";
        String actual = IfLight.ifLight();
        Assertions.assertEquals(expected, actual);
    }
}
