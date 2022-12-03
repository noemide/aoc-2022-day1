package day1;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Path path = Paths.get("day1/src/input.txt");
        List<Integer> max_calories = new ArrayList<Integer>();
        int calories = 0;
        try {
            for (String line: Files.readAllLines(path)) {
                if(!line.isEmpty()){
                    calories += Integer.parseInt(line);
                }else{
                        max_calories.add(calories);
                        calories = 0;
                }   
            }
            Collections.sort(max_calories);
            Collections.reverse(max_calories);
            int total_calories = max_calories.get(0)+max_calories.get(1)+max_calories.get(2);
            System.out.println(total_calories);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
