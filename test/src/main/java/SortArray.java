import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Dictionary<char, int> dictionary =new Hashtable();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!dictionary.get(c)) dictionary.put(s.charAt(i), 1);
            else {
                dictionary.put(c, dictionary.get(c) + 1);
            }
        }
    }
}
