package ua.lviv.iot.algo.part1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;

import java.lang.ref.PhantomReference;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Chair {
    private  String material;
    private int maxWeight;
    private String owner;

    private static final String HEADERS = " material, maxWeight, owner\n";

    abstract void adjustPosition(int value);

    public String getHeaders(){
        return HEADERS;
    }
    public String toCSV(){
        return material + "," + maxWeight + "," + owner + "\n";
    }
}
