package org.airsonic.player.basic_tests;

import org.airsonic.player.domain.Playlist;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

//Author : Patrick O'Doherty
//This case tests and verifies the creation of Playlist objects

public class SetPlaylistNameTest {
    private Playlist sut;

    @Before
    public void createPlaylist() {
        sut = new Playlist();
        sut.setName("Patrick's Playlist");
    }

    @Test
    public void givenPlaylist_whenPlaylistNameSet_thenPlaylistNameUpdated() {
        assertEquals("Patrick's Playlist", sut.getName());
    }
}