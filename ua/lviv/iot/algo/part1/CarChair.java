package ua.lviv.iot.algo.part1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CarChair extends Chair{
private int lengthToWheel;
private boolean heating;

    @Override
    void adjustPosition(int lenghtToWheel) {
        lenghtToWheel++;
    }

    public CarChair(String material, int maxWeight, String owner, int lengthToWheel, boolean heating) {
        super(material, maxWeight, owner);
        this.lengthToWheel = lengthToWheel;
        this.heating = heating;
    }

    @Override
    public String toString() {
        return "CarChair{" +
                "lengthToWheel=" + lengthToWheel +
                ", heating=" + heating +
                "} " + super.toString();
    }
}

