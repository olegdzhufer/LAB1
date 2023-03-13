package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Chair {
   private static int id = 1;
   private String material;
   private int maxWeight;
   private String owner;
   private static Chair defaultChair = new Chair();
   public static Chair getInstance(){
       return defaultChair;
   }
   public void  occupy (String owner){
       if(isOccupied()){
           System.out.println("already occupied");
           return;
       }
       this.owner = owner;
   }
   public boolean isOccupied(){
       if(owner == null){
           return true;
       }
       return false;
   }
   public void release(){
       owner = null;
   }
    public static void main(String[] args) {
        Chair chair = new Chair();
        Chair[] mas = new Chair[4];
        mas [0] = new Chair ("derevo", 90, "Oleh");
        mas [1] = new Chair();
        mas [2] = Chair.getInstance();
        mas [3] = Chair.getInstance();

        for(int i = 0; i < mas.length; i++){
            System.out.println(mas[i]);
        }
    }
}
