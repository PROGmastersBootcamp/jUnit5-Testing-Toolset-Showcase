package hu.progmasters.testing.demo_09_tempdirectory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TempDirectory {

    @TempDir // Share a temporary directory between test methods.
    static Path sharedTempDir;
    @TempDir
    Path globalTempDir;

    @Test
    void givenTestMethodWithTempDirectory_whenWriteToFile_thenContentIsCorrect(@TempDir Path tempDir)
            throws IOException {
        Path numbers = tempDir.resolve("numbers.txt");

        List<String> lines = Arrays.asList("1", "2", "3");
        Files.write(numbers, lines);

        assertAll(
                () -> assertTrue(Files.exists(numbers), "File should exist"),
                () -> assertLinesMatch(lines, Files.readAllLines(numbers)));
    }

}
