import java.util.*;
public void set(int row, int col, int data) {
    if (row >= 0 && row < array.length && col >= 0 && col < array[0].length) {
        array[row][col] = data;
    } else {
        System.out.println("Invalid");
    }

}