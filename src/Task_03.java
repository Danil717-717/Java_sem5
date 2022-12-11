// ����� ����� �����, ��������: ����� � ������ ���� ��������
// ��� �� �������� ���� ���������� ���� ��������� ��������
// �������� ����� ������� ��������� ��� ������ �� ������
// � ������� TreeMap. ������ � ���������� ������� ��
// ������ ����������.


import java.util.TreeMap;

public class Task_03 {
    public static void main(String[] args) {
        sortMap();
    }

    public static void sortMap(){
        String s = "����� � ������ ���� �������� ��� �� �������� ���� ���������� ���� ��������� ��������";
        TreeMap<Double, String> list = new TreeMap<>();
        String [] sMas = s.split(" ");                       // �������� �� �������

        System.out.println(sMas.length);                          // ������� � ��� ��������� � ������

        for (int i = 0; i < sMas.length; i++) {                           // �������� ������ �� ������ � ��� TreeMap �� ����� ���-�� ���� � �����
            if (list.containsKey((double)sMas[i].length())) {           // ���� ��������� ����, �� ������� 0.0001 * i
                list.put(sMas[i].length() + 0.0001 * i, sMas[i]);
            }else {
                list.put((double) sMas[i].length(), sMas[i]);           // ����� ������ ��������� ������
            }                                                            // � �������� ���� �����, TreeMap ��� ��������� �� �����
        }
        for(var el : list.entrySet()){                              // �������� ������ �� TreeMap
            System.out.println(el.getKey() + " " + el.getValue());  // ������� ���� �������� ����� ������
        }
    }
}
