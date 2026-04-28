package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilePathUtilTest {

    @Test
    public void testBuildPathUsesSystemSeparator() {
        FilePathUtil util = new FilePathUtil();

        String expected = "data" + File.separator + "input.txt";
        String actual = util.buildPath("data", "input.txt");

        assertEquals(expected, actual);
    }
}
