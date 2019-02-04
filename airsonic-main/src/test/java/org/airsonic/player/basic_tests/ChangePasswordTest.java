package org.airsonic.player.basic_tests;
import org.airsonic.player.command.UserSettingsCommand;
import org.airsonic.player.domain.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/*
This is a test of changing the password of a user.

Author: Brent Schleper
 */
public class ChangePasswordTest {
    private User testuser = new User("username", "pw1", "email@email.com");
    private UserSettingsCommand usc = new UserSettingsCommand();

    @Before
    public void buildUserAndUSC(){
        usc.setUser(testuser);
    }


    @Test
    public void givenOriginalPassword_whenGivenNewPassword_thenPasswordUpdated(){
        testuser.setPassword("MyNewPassword");
        assertEquals("MyNewPassword",testuser.getPassword());
    }

    @After
    public void removeUser(){
        this.usc.setDeleteUser(true);
    }


}
