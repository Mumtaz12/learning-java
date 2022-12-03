package Experimenting;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languaes = new HashMap<>();

        languaes.put("name", "description");
        languaes.put("name1", "description1");

        System.out.println(languaes.get("name1"));
    }
}
