package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FeedingChairTest {

    @Test
    void adjustPosition() {
        FeedingChair feedingChair = new FeedingChair();
        feedingChair.adjustPosition(50);
        feedingChair.setMinHeight(50);
        assertEquals(50, feedingChair.getMinHeight());

    }
}