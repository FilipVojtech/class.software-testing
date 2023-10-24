package cz.filipvojtech.selfassessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz_1() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(0));
    }

    @Test
    void fizzBuzz_2() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }

    @Test
    void fizzBuzz_3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void fizzBuzz_4() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void fizzBuzz_5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void fizzBuzz_6() {
        assertEquals("-1", FizzBuzz.fizzBuzz(-1));
    }

    @Test
    void fizzBuzz_7() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(-3));
    }

    @Test
    void fizzBuzz_8() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(-30));
    }

    @Test
    void fizzBuzz_9() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(-0));
    }
}
