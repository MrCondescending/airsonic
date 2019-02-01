package org.airsonic.player.basic_tests;

//Class required for testing
import org.airsonic.player.domain.Version;

//Junit imports
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/*
    Author Terry Chauvin (Kenchava)

    This case tests and verifies the successful creation of Version objects
 */

public class VersionTest {
    private Version v;

    @Before
    public void createVersion(){
        v = new Version("1.2.3");
    }

    @Test
    public void ifVersionWhenCreatedThenEquals(){
        assertEquals(new Version("1.2.3"), v);
    }
}
