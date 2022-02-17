package com.company;

public class Main {
    /*±Класс Cow (weight, age, gender, nickName)
    ±Класс Sheep(weight, age, gender, nickName)
    ±Класс Horse(weight, age, color, gender, nickName)
    ±Класс Farm(address, cows, horses, sheep, OwnerName)
    ±2 Farm тузунуз.
    ±1-Farmда 3 sheep, 5 cows, 2 horses болсун.
    ±2-Farmда 1 sheep, 1 cow, 1 horse болсун.*/
    public static void main(String[] args) {
        // write your code here

        DomesticAnimal sheep = new Sheep(30, 3, "f", "Skinny");
        DomesticAnimal sheep2 = new Sheep(70, 7, "m", "Jock");
        DomesticAnimal sheep3 = new Sheep(80, 5, "f", "Fat");

        DomesticAnimal cow = new Cow(150, 5, "m", "Madonna");
        DomesticAnimal cow2 = new Cow(200, 7, "m", "Murka");
        DomesticAnimal cow3 = new Cow(100, 8, "f", "Bigboy");
        DomesticAnimal cow4 = new Cow(300, 6, "m", "Daring");
        DomesticAnimal cow5 = new Cow(500, 10, "m", "Biggirl");

        DomesticAnimal horse = new Horse(150, 4, "m", "Karaker", "white");
        DomesticAnimal horse2 = new Horse(200, 5, "m", "kashka", "black");

        //#2

        DomesticAnimal sheep1 = new Sheep(45, 3, "f", "Nuisha");
        DomesticAnimal cow1 = new Cow(350, 15, "f", "BigSister");
        DomesticAnimal horse1 = new Horse(250,4,"m","Hercules","gold");

        DomesticAnimal[] animals = {sheep, sheep2, sheep3, cow, cow2, cow3, cow4, cow5,  horse, horse2};
        DomesticAnimal[] animals2 = {sheep1, cow1, horse1};


        Sheep[] sheeps = new Sheep[3];
        Cow[] cows = new Cow[5];
        Horse[] horses = new Horse[2];

        Sheep[] sheeps1 = new Sheep[1];
        Cow[] cows1 = new Cow[1];
        Horse[] horses1 = new Horse[1];


        int counter = 0;
        int counter2 = 0;
        int counter3 = 0;

        for (DomesticAnimal f : animals) {
            if (f instanceof Cow) {
                cows[counter] = (Cow) f;
                counter++;
            }
            if (f instanceof Horse) {
                horses[counter2] = (Horse) f;
                counter2++;
            }
            if (f instanceof Sheep) {
                sheeps[counter3] = (Sheep) f;
                counter3++;
            }

        }


        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;

        for (DomesticAnimal s : animals2) {
            if (s instanceof Cow) {
                cows1[counter4] = (Cow) s;
                counter4++;
            }
            if (s instanceof Sheep) {
                sheeps1[counter5] = (Sheep) s;
                counter5++;
            }
            if (s instanceof Horse) {
                horses1[counter6] = (Horse) s;
                counter6++;
            }
        }

        Farm farm = new Farm("Belek", cows, horses, sheeps, "Atabek");
        System.out.println(farm);

        Farm farm2 = new Farm("BakaiAta", cows1, horses1, sheeps1, "Alymkan");
        System.out.println(farm2);

    }
}