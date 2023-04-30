package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OfficeChairTest {

    @Test
    void adjustPosition() {
        OfficeChair officeChair = new OfficeChair();
        officeChair.adjustPosition(90);
        officeChair.setBackAngle(90);
        assertEquals(90, officeChair.getBackAngle());
    }
}