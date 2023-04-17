package ua.lviv.iot.algo.part1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Headers;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class FeedingChair extends Chair {
    private int minHeight;
    private int maxHeight;
    private int ageDesignedFor;
    private int height;

    private static final String HEADERS = "maxHeight, ageDesignedFor, height";

    public void adjustPosition(final int height) {
        while (this.height < maxHeight) {
            this.height++;
        }
    }

    public FeedingChair(final String material, final int maxWeight, final String owner, final int minHeight,final int maxHeight, final int ageDesignedFor) {
        super(material, maxWeight, owner);
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.ageDesignedFor = ageDesignedFor;
    }
    public String getHeaders(){
        return HEADERS + "," + super.getHeaders();
    }
    public String toCSV(){
        return minHeight + "," + maxHeight + "," + height + "," + ageDesignedFor + "," + super.toCSV();
    }
}

