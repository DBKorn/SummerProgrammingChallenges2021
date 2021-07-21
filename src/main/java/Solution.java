//Dovid Korn


import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isPathCrossing(String path) {
        Set<Point> cross = new HashSet<>();
        int x = 0, y = 0;
        cross.add(new Point(x,y));

        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c == 'N'){
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E'){
                x++;
            } else if (c == 'W'){
                x--;
            }
            if (!cross.add(new Point(x,y))){
                return true;
            }
        }
        return false;
    }
}