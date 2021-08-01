package sample.array;

import java.util.ArrayList;

public class SortByColor {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int[] colors= new int[3];
        for (int a : A) {
            colors[a]++;
        }
        int idx = 0;
        for (int i=0; i<colors.length; i++) {
            for (int j=0; j < colors[i]; j++) {
                A.set(idx, i);
                idx++;
            }
        }
        return A;
    }
}
