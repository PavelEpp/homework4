import java.util.Arrays;
import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

public class Project1 {
    public static void main(String[] args) {
        LinkedList<Integer> startList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        for (int i = startList.size() - 1; i >= 0; i--) {

            System.out.printf("%s ", startList.get(i));

        }
    }
}
