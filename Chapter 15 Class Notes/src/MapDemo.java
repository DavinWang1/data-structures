import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /*
            map interface is generic
        */
        Map<String, Color> favColors = new HashMap<>();

        favColors.put("Jason", Color.BLUE);
        favColors.put("Emily", Color.RED);
        favColors.put("Evan", Color.GREEN);
        favColors.put("Ethan", Color.GREEN);
        favColors.put("Emily", Color.ORANGE);

        Set<String> keys = favColors.keySet();
        for (String key : keys) {
            System.out.println("["+key+"] " + "(["+key.hashCode()+"]) : [" + favColors.get(key)+"]");
        }

    }
}
