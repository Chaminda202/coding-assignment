package com.coding.callenge;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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
    void whenWalk() {
        new Duck().walk();
        assertThat(outContent.toString(), containsString("I am walking"));
        new Chicken().walk();
        assertThat(outContent.toString(), containsString("I am walking"));
        new Rooster().walk();
        assertThat(outContent.toString(), containsString("I am walking"));
    }

    @Test
    void whenFly() {
        new Duck().fly();
        assertThat(outContent.toString(), containsString("I am flying"));
    }

    @Disabled
    @Test
    void whenSing() {

    }

    @Test
    void whenSpeak() {
        new Duck().speak("Quack, quack");
        assertThat(outContent.toString(), containsString("Quack, quack"));
        new Chicken().speak("Cluck, cluck");
        assertThat(outContent.toString(), containsString("Cluck, cluck"));
        new Rooster().speak("Cock-a-doodle-doo");
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));
    }
}
