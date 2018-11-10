package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class wb02 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean end = false;

        List<String> arrStr = new ArrayList<>();

        while (!end) {
            String input = br.readLine();
            arrStr.add(input);

            if ("END".equals(input)) {
                end = true;
            }

        }

        Map<Integer, ArrayList<String>> result = new TreeMap<>(Integer::compareTo);

        arrStr.forEach(str -> regCalendar(str, result));

        result.forEach((integer, s) -> {
            s.forEach(str -> System.out.println(str));

        });
    }

    private static Map<Integer, ArrayList<String>> regCalendar(String str, Map<Integer, ArrayList<String>> treeMap) {

        String regEx1 = "(\\d{2,4})[-](\\d{1,2})[-](\\d{1,2})";
        String regEx2 = "(\\d{2,4})[/](\\d{1,2})[/](\\d{1,2})";
        String regEx3 = "(\\d{2,4})[년](\\d{1,2})[월](\\d{1,2})[일]";

        String[] regArr = new String[]{regEx1, regEx2, regEx3};

        for (String reg : regArr) {

            Pattern pat = Pattern.compile(reg);
            Matcher m = pat.matcher(str);

            if (m.find()) {
                String year = m.group(1).length() == 2 ? "20" + m.group(1) : m.group(1);
                String month = m.group(2).length() == 1 ? "0" + m.group(2) : m.group(2);
                String day = m.group(3).length() == 1 ? "0" + m.group(3) : m.group(3);

                Integer key = Integer.valueOf(year + month + day);

                ArrayList<String> value = new ArrayList<>();

                if (treeMap.containsKey(key)) {
                    treeMap.get(key).add(str);
                } else {
                    value.add(str);
                    treeMap.put(key, value);
                }

                return treeMap;
            }
        }

        return treeMap;
    }


}
