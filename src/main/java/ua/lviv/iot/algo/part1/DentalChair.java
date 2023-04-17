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

    private static final String HEADERS = "angleChair";

    @Override
    public void adjustPosition(final int angleChair) {
        this.angleChair += angleChair;
    }

    public DentalChair(final String material, final int maxWeight, final String owner, final int angleChair) {
        super(material, maxWeight, owner);
        this.angleChair = angleChair;
    }

    public String getHeaders() {
        return HEADERS + "," + super.getHeaders();
    }

    public String toCSV(){
        return angleChair + "," + super.toCSV();
    }
}
