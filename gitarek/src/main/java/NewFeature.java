import java.util.ArrayList;
import java.util.List;

public class NewFeature {
    public static void main(String[] args) {
        List<String> lista = listName ("Darek", "Marek");
        for (String a:lista) {
            System.out.println (a);
        }

    }
    static List<String> listName(String name1, String name2){
        List<String> stringList = new ArrayList<String> ();
        stringList.add (name1);
        stringList.add (name2);
        return stringList;
    }
}
