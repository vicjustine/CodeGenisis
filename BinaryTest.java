package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit tests for the Binary class.
 */
public class BinaryTest {

    @Test
    public void testOr() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("0101");
        Binary result = Binary.or(binary1, binary2);
        assertEquals("1111", result.getValue());
    }

    @Test
    public void testOrDifferentLengths() {
        Binary binary1 = new Binary("1");
        Binary binary2 = new Binary("1111");
        Binary result = Binary.or(binary1, binary2);
        assertEquals("1111", result.getValue());
    }

    @Test
    public void testAnd() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("1100");
        Binary result = Binary.and(binary1, binary2);
        assertEquals("1000", result.getValue());
    }

    @Test
    public void testMultiply() {
        Binary binary1 = new Binary("10");
        Binary binary2 = new Binary("11");
        Binary result = Binary.multiply(binary1, binary2);
        assertEquals("110", result.getValue());
    }

    @Test
    public void testMultiplyWithZero() {
        Binary binary1 = new Binary("10101");
        Binary binary2 = new Binary("0");
        Binary result = Binary.multiply(binary1, binary2);
        assertEquals("0", result.getValue());
    }

    @Test
    public void testAdd() {
        Binary binary1 = new Binary("101");
        Binary binary2 = new Binary("11");
        Binary result = Binary.add(binary1, binary2);
        assertEquals("1000", result.getValue());
    }

    @Test
    public void testAddDifferentLengths() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("1");
        Binary result = Binary.add(binary1, binary2);
        assertEquals("1011", result.getValue());
    }

    @Test
    public void testSanitizeBinary() {
        Binary binary = new Binary("0000101");
        assertEquals("101", binary.getValue());
    }

    @Test
    public void testSanitizeBinaryZero() {
        Binary binary = new Binary("0000");
        assertEquals("0", binary.getValue());
    }
}

