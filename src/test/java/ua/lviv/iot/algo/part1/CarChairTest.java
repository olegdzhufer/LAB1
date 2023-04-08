package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarChairTest {

    @Test
    void adjustPosition() {
        CarChair carChair = new CarChair();
        carChair.adjustPosition(40);
        carChair.setLengthToWheel(40);
        assertEquals(40, carChair.getLengthToWheel());
    }
}