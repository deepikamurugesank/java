import java.util.*;
import java.util.Arrays;
import java.util.function.Consumer;

class cons {

    public static void main(String[] args) {
        List<Integer> disneyCharacters = Arrays.asList(1, 2, 3, 4, 5, 6);
/*Consumer<String> con = new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
            }
        };*/
        

        //Consumer<Integer> con .
        = s -> System.out.println(s);
       // disneyCharacters.forEach(con);
        //disneyCharacters.forEach(s->System.out.println(s));

        
        // call by method
        disneyCharacters.forEach(System.out::println);

    }
}