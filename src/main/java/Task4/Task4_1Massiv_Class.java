package Task4;

import java.util.Random;

public class Task4_1Massiv_Class {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] mass = new int[20];
        int minPos=0, maxPos=0, buf;
        for (int i=0; i<20; i++){
            mass[i] = rand.nextInt(21)-10;
            System.out.print (" "+mass[i]);
        }
        for (int i=0; i<20; i++){
            if ((mass[i] < 0) & (mass[minPos] > mass[i])){
                minPos = i;
            } if  ((mass[i] > 0) & (mass[i] < mass[maxPos])){
                maxPos = i;
            }
        }
        buf = mass[minPos];
        mass[minPos] = mass[maxPos];
        mass[maxPos] = buf;

        System.out.println();
        for (int i=0; i<20; i++){
            System.out.print (" "+mass[i]);
        }
    }
}
