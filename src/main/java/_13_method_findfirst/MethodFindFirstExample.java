package _13_method_findfirst;

import java.util.ArrayList;
import java.util.List;

public class MethodFindFirstExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("C#");

        String str = list.stream()
                .filter(e -> e.length() > 3)
                .findFirst()
                .get();
        System.out.println(str);
    }
}
