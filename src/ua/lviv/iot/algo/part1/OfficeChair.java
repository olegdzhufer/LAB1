package ua.lviv.iot.algo.part1;

import lombok.*;
@NoArgsConstructor
@Getter
@Setter
public class OfficeChair extends Chair{
private int backAngle;
private String materialUpholstary;

    public OfficeChair(String material, int maxWeight, String owner, int backAngle, String materialUpholstary) {
        super(material, maxWeight, owner);
        this.backAngle = backAngle;
        this.materialUpholstary = materialUpholstary;
    }
    public void adjustPosition(int angle){
     angle ++;
    }

    @Override
    public String toString() {
        return "OfficeChair{" +
                "backAngle=" + backAngle +
                ", materialUpholstary='" + materialUpholstary + '\'' +
                "} " + super.toString();
    }
}

