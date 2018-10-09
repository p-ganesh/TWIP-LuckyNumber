package com.company;

/**
 * Created by pg304 on 10/9/18.
 */
public class Random {
    public int random;
    public int age;

    public int Number (int lucky) {
        random = (int)(Math.random()*age);
        lucky = random * random;
        return lucky;
    }
}
