package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChairManagerTest {

    private ChairManager chairManager;

    @BeforeEach
    public void setUp() {
        ChairManager chairManager = new ChairManager();
        chairManager.addChair(new OfficeChair("metal", 100, "Oleh", 90, "skin"));
        chairManager.addChair(new OfficeChair("plastic", 110, "Ihor", 100, "skin"));
        chairManager.addChair(new FeedingChair("wood", 90, "Oleksiy", 50, 60, 2));
        chairManager.addChair(new FeedingChair("metal", 60, "Andriy", 45, 70, 3));
        chairManager.addChair(new CarChair("skin", 150, "Ivan", 50, true));
        chairManager.addChair(new CarChair("flock", 160, "Maks", 60, false));
        chairManager.addChair(new DentalChair("velor", 170, "Ostap", 170));
        chairManager.addChair(new DentalChair("imitation leather", 180, "Danylo", 165));
    }

    @Test
    void findChairWhichMaxWeightMoreThan() {

        List<Chair> chairs = chairManager.findChairWhichMaxWeightMoreThan(160);
        assertEquals(2, chairs.size());
        for (Chair chair : chairs) {
            chair.getMaxWeight();
        }
    }

    @Test
    void findChairWithOwnerOleh() {

        List<Chair> chairs = chairManager.findChairWithOwnerOleh();
        assertEquals(1, chairs.size());
        for (Chair chair : chairs) {
            assertEquals("Oleh", chair.getOwner());
        }
    }

}