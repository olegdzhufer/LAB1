package ua.lviv.iot.algo.part1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ChairWritter {

    public static void main(String args[]) throws IOException {
        ChairManager chairManager = new ChairManager();
        chairManager.addChair(new OfficeChair("metal", 100, "Oleh", 90, "skin"));
        chairManager.addChair(new OfficeChair("plastic", 110, "Ihor", 100, "skin"));
        chairManager.addChair(new FeedingChair("wood", 90, "Oleksiy", 50, 60, 2));
        chairManager.addChair(new FeedingChair("metal", 60, "Andriy", 45, 70, 3));
        chairManager.addChair(new CarChair("skin", 150, "Ivan", 50, true));
        chairManager.addChair(new CarChair("flock", 160, "Maks", 60, false));
        chairManager.addChair(new DentalChair("velor", 170, "Ostap", 170));
        chairManager.addChair(new DentalChair("imitation leather", 180, "Danylo", 165));

        ChairWritter chairWritter = new ChairWritter();
        chairWritter.writeToFile(chairManager.getChairs());
    }

    public void writeToFile(List<Chair> chairs) throws IOException {

        String defaultFileName = "result.csv";
        try (FileWriter writer = new FileWriter(new File(defaultFileName))) {
            Collections.sort(chairs,
                    Comparator.comparing(o -> o.getClass().getName()));

            String tempNameClass = null;
            for (Chair chair : chairs) {
                if (tempNameClass != chair.getClass().getName()) {
                    writer.write(chair.getHeaders());
                    writer.write(chair.toCSV());
                    tempNameClass = chair.getClass().getName();
                } else {
                    writer.write(chair.toCSV());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}




