package TheDescent.Level01;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int hMountain = 0;
            int hMountainIndex = 0;
            for (int i = 0; i < 8; i++) {

                int mountainH = in.nextInt(); // represents the height of one mountain.

                if (mountainH > hMountain){
                    hMountain = mountainH;
                    hMountainIndex = i;
                }

            }
            System.out.println(hMountainIndex); // The index of the mountain to fire on.
        }
    }
}