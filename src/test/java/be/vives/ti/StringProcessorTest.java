package be.vives.ti;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    private StringProcessor stringProcessor;

    @BeforeEach
    void setUp() {
        stringProcessor = new StringProcessor();
    }

    @Test
    public void withSuffixDoNothing(){
        String result = stringProcessor.appendIfMissing("Hello world","world");
        assertEquals("Hello world",result);
    }

    @Test
    public void withSuffix(){
        String result = stringProcessor.appendIfMissing("Hello world","!!!");
        assertEquals("Hello world!!!",result);
    }
}