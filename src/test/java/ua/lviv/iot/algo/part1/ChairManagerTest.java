package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChairManagerTest {
    @BeforeEach

    @Test
    void findChairWhichMaxWeightMoreThan() {
        ChairManager chairManager = new ChairManager();
        chairManager.addChair(new OfficeChair("metal", 100, "Oleh", 90, "skin"));
        chairManager.addChair(new OfficeChair("plastic", 110, "Ihor", 100, "skin"));
        chairManager.addChair(new FeedingChair("wood", 90, "Oleksiy", 50, 60, 2));
        chairManager.addChair(new FeedingChair("metal", 60, "Andriy", 45, 70, 3));
        chairManager.addChair(new CarChair("skin", 150, "Ivan", 50, true));
        chairManager.addChair(new CarChair("flock", 160, "Maks", 60, false));
        chairManager.addChair(new DentalChair("velor", 170, "Ostap", 170));
        chairManager.addChair(new DentalChair("imitation leather", 180, "Danylo", 165));

        List<Chair> chairs = chairManager.findChairWhichMaxWeightMoreThan(160);
        assertEquals(2, chairs.size());
        assertTrue(chairs.get(0).getMaxWeight() > 160);
        assertTrue(chairs.get(1).getMaxWeight() > 160);
    }

    @Test
    void findChairWithOwnerOleh() {
        ChairManager chairManager = new ChairManager();
        chairManager.addChair(new OfficeChair("metal", 100, "Oleh", 90, "skin"));
        chairManager.addChair(new OfficeChair("plastic", 110, "Ihor", 100, "skin"));
        chairManager.addChair(new FeedingChair("wood", 90, "Oleksiy", 50, 60, 2));
        chairManager.addChair(new FeedingChair("metal", 60, "Andriy", 45, 70, 3));
        chairManager.addChair(new CarChair("skin", 150, "Ivan", 50, true));
        chairManager.addChair(new CarChair("flock", 160, "Maks", 60, false));
        chairManager.addChair(new DentalChair("velor", 170, "Ostap", 170));
        chairManager.addChair(new DentalChair("imitation leather", 180, "Danylo", 165));

        List<Chair> chairs = chairManager.findChairWithOwnerOleh();
        assertEquals("Oleh", chairs.get(0).getOwner());
    }

    @Test
    void addChair() {
        ChairManager chairManager = new ChairManager();
        OfficeChair chair1 = new OfficeChair("metal", 100, "Oleh", 90, "skin");
        DentalChair chair2 = new DentalChair("velor", 170, "Ostap", 170);
        chairManager.addChair(chair1, chair2);
        assertEquals(2, chairManager.getChairs().size());
    }

    @Test
    void getChairs() {

    }

    @Test
    public void testToString() {

        ChairManager chairManager = new ChairManager();
        chairManager.addChair(new OfficeChair("metal", 100, "Oleh", 90,"skin"));
        chairManager.addChair(new OfficeChair("plastic",110,"Ihor", 100,"skin"));
        chairManager.addChair(new FeedingChair("wood",90,"Oleksiy",50,60,2));
        chairManager.addChair(new FeedingChair("metal", 60, "Andriy", 45, 70,3));
        chairManager.addChair(new CarChair("skin",150,"Ivan",50,true));
        chairManager.addChair(new CarChair("flock",160,"Maks", 60,false));
        chairManager.addChair(new DentalChair("velor",170,"Ostap",170));
        chairManager.addChair(new DentalChair("imitation leather",180,"Danylo",165));

        String expected ="ChairManager(chairs=[OfficeChair{backAngle=90, materialUpholstary='skin'} Chair(material=metal, maxWeight=100, owner=Oleh), OfficeChair{backAngle=100, materialUpholstary='skin'} Chair(material=plastic, maxWeight=110, owner=Ihor), FeedingChair(super=Chair(material=wood, maxWeight=90, owner=Oleksiy), minHeight=50, maxHeight=60, ageDesignedFor=2), FeedingChair(super=Chair(material=metal, maxWeight=60, owner=Andriy), minHeight=45, maxHeight=70, ageDesignedFor=3), CarChair(super=Chair(material=skin, maxWeight=150, owner=Ivan), lengthToWheel=50, heating=true), CarChair(super=Chair(material=flock, maxWeight=160, owner=Maks), lengthToWheel=60, heating=false), DentalChair(super=Chair(material=velor, maxWeight=170, owner=Ostap), angleChair=170), DentalChair(super=Chair(material=imitation leather, maxWeight=180, owner=Danylo), angleChair=165)])";
        assertEquals(expected, chairManager.toString());
    }
}