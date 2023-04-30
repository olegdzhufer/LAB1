package ua.lviv.iot.algo.part1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class CarChair extends Chair {
    private int lengthToWheel;
    private boolean heating;

    private static final String HEADERS = "lengthToWheel, heating";

    @Override
    public void adjustPosition(final int lengthToWheel) {
        this.lengthToWheel += lengthToWheel;
    }

    public CarChair(final String material, final int maxWeight, final String owner, final int lengthToWheel,final boolean heating) {
        super(material, maxWeight, owner);
        this.lengthToWheel = lengthToWheel;
        this.heating = heating;
    }

    public String getHeaders(){
        return HEADERS + "," + super.getHeaders();
    }
    public String toCSV(){
        return lengthToWheel + "," + heating + "," + super.toCSV();
    }
}

