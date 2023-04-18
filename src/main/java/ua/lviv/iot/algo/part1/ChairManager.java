package ua.lviv.iot.algo.part1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
@ToString
@Getter
@Setter
@NoArgsConstructor

public class ChairManager {
    private final List<Chair> chairs = new LinkedList<>();
    public static void main (String [] args) {
        ChairManager chairManager = new ChairManager();
        chairManager.addChair(new OfficeChair("metal", 100, "Oleh", 90,"skin"));
        chairManager.addChair(new OfficeChair("plastic",110,"Ihor", 100,"skin"));
        chairManager.addChair(new FeedingChair("wood",90,"Oleksiy",50,60,2));
        chairManager.addChair(new FeedingChair("metal", 60, "Andriy", 45, 70,3));
        chairManager.addChair(new CarChair("skin",150,"Ivan",50,true));
        chairManager.addChair(new CarChair("flock",160,"Maks", 60,false));
        chairManager.addChair(new DentalChair("velor",170,"Ostap",170));
        chairManager.addChair(new DentalChair("imitation leather",180,"Danylo",165));

        System.out.println(chairManager);
        System.out.println(chairManager.findChairWithOwnerOleh());
        System.out.println(chairManager.findChairWhichMaxWeightMoreThan(80));
        System.out.println(chairManager.findChairWhichMaxWeightMoreThan(120));
    }
    public List<Chair> findChairWhichMaxWeightMoreThan(final int kilo){
        return chairs.stream()
                .filter(c ->c.getMaxWeight() > kilo)
                .collect(Collectors.toList());
    }
    public List<Chair> findChairWithOwnerOleh()
    {
        return chairs.stream()
                .filter(g -> g.getOwner().startsWith("Oleh"))
                .collect(Collectors.toList());
    }

    public void addChair(Chair... chair) {
        chairs.addAll(List.of(chair));
    }
}
