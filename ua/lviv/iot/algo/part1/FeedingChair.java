package ua.lviv.iot.algo.part1;

import lombok.*;
@NoArgsConstructor
@Getter
@Setter

public class FeedingChair extends Chair{
    private int minHeight;
    private int maxHeight;
    private int ageDesignedFor;
    public void adjustPosition(int height){
        while(height < maxHeight){
            height++;
        }
    }
    public FeedingChair(String material, int maxWeight, String owner, int minHeight, int maxHeight, int ageDesignedFor) {
        super(material, maxWeight, owner);
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.ageDesignedFor = ageDesignedFor;
    }

    @Override
    public String toString() {
        return "FeedingTable{" +
                "minHeight=" + minHeight +
                ", maxHeight=" + maxHeight +
                ", ageDesignedFor=" + ageDesignedFor +
                "} " + super.toString();
    }
}

