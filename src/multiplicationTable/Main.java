package multiplicationTable;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Example> examples = new HashSet<>();
        while (examples.size() < 15) {
            Example example = new Example(random.nextInt(7) + 2, random.nextInt(7) +2);
            examples.add(example);
            System.out.println(example);
        }
    }
}
