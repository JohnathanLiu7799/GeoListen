package com.example.geolisten;

import org.junit.Test;

import static org.junit.Assert.*;
import com.example.geolisten.User.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testUserCreation() {
        User user = new User(null, "MyUserName", "pwd123");

        assertNotNull(user);
        String pwd = user.getPassword();
        assertEquals(pwd, "pwd123");
        System.out.println("I did test user creation");
    }
}