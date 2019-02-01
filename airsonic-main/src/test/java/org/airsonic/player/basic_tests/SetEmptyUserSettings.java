package org.airsonic.player.basic_tests;

import org.airsonic.player.command.UserSettingsCommand;
import org.airsonic.player.domain.User;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
This is to test whether or not a user is allowed to have an empty password.
Furthermore, the user will then have its username/password set to a set of special characters to test if this was allowed

Author: Noah Fields (OGoodness)
 */

public class SetEmptyUserSettings {

    private User testuser = new User("", "", "testie@testing.com");
    private UserSettingsCommand usc = new UserSettingsCommand();
    private String specialUsername = "A1\"\'\\/\n{}[]=+-_";
    private String specialPassword = "A1\"\'\\/\n{}[]=+-_";

    @Before
    public void buildUserAndUSC(){

        usc.setUser(testuser);


    }

    @After
    public void removeUser(){
        this.usc.setDeleteUser(true);
    }

    @Test
    public void NoUsernameWhenSetUsername(){
        usc.setUsername(specialUsername);
        assertSame(testuser.getUsername(), specialUsername);
    }
    @Test
    public void NoPasswordWhenSetPassword(){
        testuser.setPassword(specialPassword);
        assertSame(testuser.getPassword(), specialPassword);
    }



}
