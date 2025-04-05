import java.util.*;
public static int findLastDuplicate(int[] array) {
    int[] seen = new int[array.length];
    int index = 0;

    for (int i = array.length - 1; i >= 0; i--) {
        for (int j = 0; j < index; j++) {
            if (seen[j] == array[i]) {
                return array[i];
 }
   }
    seen[index++] = array[i];
  }
    return -1;
}