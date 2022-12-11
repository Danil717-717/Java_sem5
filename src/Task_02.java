// ���� 2 ������, �������� �����, ������� ������ true, ����
// ���� ��������� �������� ����������� � false, ���� ���.
//������ ���������, ���� ���� ����� � ������ ����� ����� ��������
// �� ��������� ����� �� ������ �����, ��� ����
// - ������������� ����� ������ ����� �������� �� ���� � �� �� ����� � �����������
//   ������� ����������.(add = egg ���������)
// - ����� ����� �� ��������, � �������� ����� ��(note = code)
// ������: s = "foo"; t = "bar"   - false
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
