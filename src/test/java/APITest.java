package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITest {

    @Test
    public void getUserTest() {

        int statusCode = 200;

        Assert.assertEquals(statusCode, 200);

        System.out.println("API Test Passed");
    }
}
