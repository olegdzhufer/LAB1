package ua.lviv.iot.algo.part1;
import lombok.*;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Chair {
    private String material;
    private int maxWeight;
    private String owner;
    abstract void adjustPosition(int value);
}
