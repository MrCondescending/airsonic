package org.airsonic.player.basic_tests;

import org.airsonic.player.domain.Playlist;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

//Author : Patrick O'Doherty
//This case tests and verifies the creation of Playlist objects

public class SetPlaylistTest {
    private Playlist p;

    @Before
    public void createPlaylist() {
        p = new Playlist();
        p.setName("Patrick's Playlist");
    }

    @Test
    public void ifPlayListWhenNameSetThenEquals() {
        assertEquals("Patrick's Playlist", p.getName());
    }
}