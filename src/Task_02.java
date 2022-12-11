// ƒаны 2 строки, написать метод, который вернет true, если
// если этистроки €вл€ютс€ изоиорфными и false, если нет.
//—троки изоморфны, если одну букву в первом слове можно заменить
// на некоторую букву во втором слове, при этом
// - повтор€ющиес€ буквы одного слова мен€ютс€ на одну и ту же букву с сохранением
//   пор€дка следовани€.(add = egg изоморфнф)
// - буква может не мен€тьс€, а остатьс€ такой же(note = code)
// пример: s = "foo"; t = "bar"   - false
//         s = "paper";  t = "title"  - true


import java.util.HashMap;
import java.util.Map;

public class Task_02 {
    public static void main(String[] args) {
        System.out.println(isIzomorf("paper","title"));

    }

    public static boolean isIzomorf(String s1, String s2){
        // s = "paper", t = "title"
        //key  value
        // p -> t
        // a -> i
        // e -> l
        // r -> e

        if(s1.length()!= s2.length())
            return false;
        if(s1.equals(s2))
            return true;
        Map<Character, Character> subWord = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if(subWord.containsKey(a) && b != subWord.get(a))
                return false;
            else
                subWord.put(a, b);
        }
        return true;
    }
}
