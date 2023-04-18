package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DentalChairTest {

    @Test
    void adjustPosition() {
        DentalChair dentalChair = new DentalChair();
        dentalChair.adjustPosition(140);
        dentalChair.setAngleChair(140);
        assertEquals(140, dentalChair.getAngleChair());
    }
}