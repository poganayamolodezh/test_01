import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(5);
        list.add(4);

        Map<Integer ,Long > map = list.stream().collect(  Collectors.groupingBy(c ->c , Collectors.counting())) ;
        map.forEach((k , v ) -> System.out.print( k + " : "+ v + ", " ));

    }
}


