import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesHashSet {
    public static List<Integer> findDuplicates(int[] array) {
        HashSet<Integer> seenElements = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : array) {
            if (!seenElements.add(num)) { // If add() returns false, element is already in the set
                duplicates.add(num);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 1, 6, 3};
        List<Integer> duplicateNumbers = findDuplicates(numbers);
        System.out.println("Duplicate elements: " + duplicateNumbers);
    }
}
