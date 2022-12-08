package First.onboarding;

import java.util.*;

public class AppProblem6 {
    private static List<String> names = new ArrayList<>();

    public static void main(String[] args) {
        List<List<String>> forms = Arrays.asList(Arrays.asList("jm@email.com", "제이엠"),
          Arrays.asList("jason@email.com", "제이슨"),
          Arrays.asList("woniee@email.com", "워니"),
          Arrays.asList("mj@email.com", "엠제이"),
          Arrays.asList("nowm@email.com", "이제엠"));

        for (int i = 0; i < forms.size(); i++) {
            names.add(forms.get(i).get(1));
        }

        Set<Integer> duplicationNumbers = new HashSet<>();

        for (int i = 0; i < names.size(); i++) {
            String[] splitNames = names.get(i).split("");

            for (int j = 0; j < names.get(i).length() - 1; j++) {
                String name = splitNames[j] + splitNames[j + 1];

                for (int k = i + 1; k < names.size(); k++) {
                    if (names.get(k).contains(name)) {
                        duplicationNumbers.add(k);
                        duplicationNumbers.add(i);
                    }
                }
            }
        }

        System.out.println(duplicationNumbers);

        List<String> result = new ArrayList<>();

        for (int i = 0; i <= forms.size(); i++) {
            if (duplicationNumbers.contains(i)) {
                result.add(forms.get(i).get(0));
            }
        }

        System.out.println(result);
        Collections.sort(result);
        System.out.println(result);

    }

}