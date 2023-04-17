package ua.lviv.iot.algo.part1;

import java.io.*;
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

 public String writeToFile(List<Chair> chairs) throws IOException{
  if(chairs == null || chairs.isEmpty()){
   return null;
  }

  String defaultFileName = "result.csv";
  try (FileWriter writer
               = new FileWriter(defaultFileName);){
   PrintWriter out = new PrintWriter(writer);
   for (Chair chair: chairs){
    out.println(chair.getHeaders());
    out.println(chair.toCSV());
   }

  } catch (IOException e){

  }
  return defaultFileName;
 }

}

