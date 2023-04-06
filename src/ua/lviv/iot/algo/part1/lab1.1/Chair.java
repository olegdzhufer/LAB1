package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Chair {

    private static final int id = 1;
    private String material;
    private int maxWeight;
    private String owner;

    private static Chair defaultChair = new Chair();

    public static Chair getInstance() {
        return defaultChair;
    }

    public void occupy(String owner) {
        if (isOccupied()) {
            return;
        }
        this.owner = owner;
    }

    public boolean isOccupied() {
        return owner == null;
    }

    public void release() {
        owner = null;
    }

    public static void main(String[] args) {
        Chair[] mas = {
                new Chair("derevo", 90, "Oleh"),
                new Chair(),
                Chair.getInstance()
                , Chair.getInstance()};

        for (Chair ma : mas) {
            System.out.println(ma);
        }
    }
}