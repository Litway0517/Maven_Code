package com.itheima;

import org.junit.Assert;

public class DemoTest {

    public void testSay() {
        Demo demo = new Demo();
        String itheima = demo.say("itheima");
        Assert.assertEquals("hello itheima", itheima);
    }




}
