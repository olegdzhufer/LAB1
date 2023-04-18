package ua.lviv.iot.algo.part1;
import lombok.*;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Chair {
    protected String material;
    protected int maxWeight;
    protected String owner;
    abstract void adjustPosition(int value);
}
