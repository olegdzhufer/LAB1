package ua.lviv.iot.algo.part1;
import lombok.*;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public abstract class Chair {

    private static final int id = 1;
    private String material;
    private int maxWeight;
    private String owner;
    abstract void adjustPosition(int value);
}
