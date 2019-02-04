package org.airsonic.player.basic_tests;

import org.airsonic.player.command.UserSettingsCommand;
import org.airsonic.player.controller.UserSettingsController;
import org.airsonic.player.domain.User;
import static org.junit.Assert.*;

import org.airsonic.player.service.SecurityService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
This is a test of the admin setAdmin feature of the application

Author: Devin Workman (MrCondescending)
 */
public class GiveAdminTest {
    private User testuser = new User("testuser", "test", "test@test.com");
    private UserSettingsCommand usc = new UserSettingsCommand();
    @Before
    public void buildUserAndUSC(){

        usc.setUser(testuser);
    }

    @After
    public void removeUser(){
        this.usc.setDeleteUser(true);
    }

    @Test
    public void givenUserIsNotAdmin_whenGivenAdmin_thenIsAdmin(){
        testuser.setAdminRole(true);
        assertTrue(testuser.isAdminRole());
    }


}
