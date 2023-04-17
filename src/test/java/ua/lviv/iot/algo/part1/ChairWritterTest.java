package ua.lviv.iot.algo.part1;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;


public class ChairWritterTest extends TestCase {

    private  ChairWritter writer;
    private List<Chair> chairs;
    private static final String RESULT_FILE_NAME = "result.csv";
    private static final String EXPECTED_FILENAME = "expected.csv";

    @BeforeEach
    public void setUp() throws IOException {
        writer = new ChairWritter();
        chairs = new LinkedList<>();
        chairs.add(new OfficeChair("metal", 100, "Oleh", 90,"skin"));
        chairs.add(new OfficeChair("plastic",110,"Ihor", 100,"skin"));
        chairs.add(new FeedingChair("wood",90,"Oleksiy",50,60,2));
        chairs.add(new FeedingChair("metal", 60, "Andriy", 45, 70,3));
        chairs.add(new CarChair("skin",150,"Ivan",50,true));
        chairs.add(new CarChair("flock",160,"Maks", 60,false));
        chairs.add(new DentalChair("velor",170,"Ostap",170));
        chairs.add(new DentalChair("imitation leather",180,"Danylo",165));
    }

    @AfterAll
    public void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILE_NAME));
    }

    @Test
    public void testEmptyWrite() throws IOException {
        writer.writeToFile(null);

        File file = new File(RESULT_FILE_NAME);
        Assert.assertTrue(file.exists());
    }

    @Test
    public void testWriteListOfChairs() throws IOException {
        writer.writeToFile(chairs);
        File file = new File(RESULT_FILE_NAME);

        Path expected = new File(EXPECTED_FILENAME).toPath();
        Path actual = new File(RESULT_FILE_NAME).toPath();

        assertEquals(-1L, Files.mismatch(expected, actual));
    }

    @Test
    public void testFileOverride() throws IOException{
        testWriteListOfChairs();
    }
}