package com.coding.callenge;

import com.coding.callenge.enume.SoundEnum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        new Parrot().fly();
        assertThat(outContent.toString(), containsString("I am flying"));
    }

    @Disabled
    @Test
    void whenSing() {

    }

    @Test
    void whenSpeak() {
        new Duck().speak(SoundEnum.DUCK);
        assertThat(outContent.toString(), containsString("Quack, quack"));
        new Chicken().speak(SoundEnum.CHICKEN);
        assertThat(outContent.toString(), containsString("Cluck, cluck"));
        new Rooster().speak(SoundEnum.ROOSTER);
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));

        new Parrot().speak(SoundEnum.DOG);
        assertThat(outContent.toString(), containsString("Woof, woof"));
        new Parrot().speak(SoundEnum.CAT);
        assertThat(outContent.toString(), containsString("Meow"));
        new Parrot().speak(SoundEnum.ROOSTER);
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));
    }

    @Test
    void whenSwim() {
        new Fish().swim();
        assertThat(outContent.toString(), containsString("I am swimming"));
    }

    @Test
    void whenSize() {
        assertEquals(new Shark().size(), "large");
        assertEquals(new Clownfish().size(), "small");
    }

    @Test
    void whenColour() {
        assertEquals(new Shark().color(), "grey");
        assertEquals(new Clownfish().color(), "orange");
    }

    @Test
    void whenJokeOrEat() {
        new Shark().eatOtherFish();
        assertThat(outContent.toString(), containsString("I eat other fish"));
        new Clownfish().makeJoke();
        assertThat(outContent.toString(), containsString("I make jokes"));
    }
}