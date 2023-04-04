package ua.lviv.iot.algo.part1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class DentalChair extends Chair {
    private int angleChair;

    @Override
    void adjustPosition(int angleChair) {
        angleChair++;
    }

    public DentalChair(String material, int maxWeight, String owner, int angleChair) {
        super(material, maxWeight, owner);
        this.angleChair = angleChair;
    }
}
