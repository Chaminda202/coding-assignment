package com.coding.callenge;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void whenBirdWalk() {
        new Bird().walk();
        assertThat(outContent.toString(), containsString("I am walking"));
    }

    @Test
    void whenBirdFly() {
        new Bird().fly();
        assertThat(outContent.toString(), containsString("I am flying"));
    }

    @Test
    void whenBirdSing() {
        new Bird().sing();
        assertThat(outContent.toString(), containsString("I am singing"));
    }
}
