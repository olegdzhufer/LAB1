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
    private static List<Chair> chairs = new LinkedList<>();

    List<Chair> getChairs (){
        return chairs;
    }

    public List<Chair> findChairWhichMaxWeightMoreThan(final int kilo) {
        return chairs.stream()
                .filter(c -> c.getMaxWeight() > kilo)
                .collect(Collectors.toList());
    }

    public List<Chair> findChairWithOwnerOleh() {
        return chairs.stream()
                .filter(g -> g.getOwner().startsWith("Oleh"))
                .collect(Collectors.toList());
    }
    public void addChair(final Chair ... chair) {
        chairs.addAll(List.of( chair));
    }

}
