import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, List<String>> map = new HashMap<>();
        while (true) {
            System.out.println("Enter city");
            String city = scan.nextLine();
            if (city.equalsIgnoreCase("stop") || city.isEmpty()) break;
            System.out.println("Enter name");
            String name = scan.nextLine();
            if (name.equalsIgnoreCase("stop") || name.isEmpty()) break;
            else if (map.containsKey(city)) {
                map.get(city).add(name);
            } else {
                ArrayList<String> Names = new ArrayList<>();
                Names.add(name);
                map.put(city, Names);
            }
        }
        System.out.println(map);
    }
}
