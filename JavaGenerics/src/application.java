
import java.util.ArrayList;
import java.util.HashMap;

class Animal
{

}

public class application
{
    public static void main(String[] args)
    {
        /*
         Before java 5
         */
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String) list.get(1);

        System.out.println(fruit);
        /*
         current usage better method
         */
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);
        System.out.println(animal);

        /*
         There can be more than one type of argument
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        /*
         Java 7 style as it will infer which generics it is using.
         */
        ArrayList<Animal> someList = new ArrayList<>();
    }
}
