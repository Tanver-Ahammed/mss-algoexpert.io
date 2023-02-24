package algoexpert.io.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumberMnemonics {

    public ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
        // Write your code here.
        Map<Character, List<Character>> map = new HashMap<>();
        map.put('0', new ArrayList<>(List.of('0')));
        map.put('1', new ArrayList<>(List.of('1')));
        map.put('2', new ArrayList<>(List.of('a', 'b', 'c')));
        map.put('3', new ArrayList<>(List.of('d', 'e', 'f')));
        map.put('4', new ArrayList<>(List.of('g', 'h', 'i')));
        map.put('5', new ArrayList<>(List.of('j', 'k', 'l')));
        map.put('6', new ArrayList<>(List.of('m', 'n', 'o')));
        map.put('7', new ArrayList<>(List.of('p', 'q', 'r', 's')));
        map.put('8', new ArrayList<>(List.of('t', 'u', 'v')));
        map.put('9', new ArrayList<>(List.of('w', 'x', 'y', 'z')));
        ArrayList<String> list = new ArrayList<>();
        numberGenerate(phoneNumber.toCharArray(), 0, map, list);
        return list;
    }

    private void numberGenerate(char[] phoneNumber, int index, Map<Character, List<Character>> map, ArrayList<String> list) {
        if (index == phoneNumber.length) {
            list.add(new String(phoneNumber));
            return;
        }
        List<Character> list1 = map.get(phoneNumber[index]);
        char prev = phoneNumber[index];
        for (Character character : list1) {
            phoneNumber[index] = character;
            numberGenerate(phoneNumber, index + 1, map, list);
        }
        phoneNumber[index] = prev;
    }

    public static void main(String[] args) {
        System.out.println(new PhoneNumberMnemonics().phoneNumberMnemonics("002"));
    }

}
