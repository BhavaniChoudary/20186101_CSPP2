import java.io.*;
import java.util.*;
import java.lang.*;
class Count {
    long bagOFWords(String one, String two) {
        HashMap<String, Integer> df1 = new HashMap<>();
        HashMap<String, Integer> df2 = new HashMap<>();
        String[] arr1 = one.split(" ");
        String[] arr2 = two.split(" ");
        for (int i = 0; i < arr1.length; i++) {
            if (df1.containsKey(arr1[i])) {
                int sample = df1.get(arr1[i]);
                sample += 1;
                df1.put(arr1[i], sample);
            } else {
                df1.put(arr1[i], 1);
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            if (df2.containsKey(arr2[j])) {
                int sample = df2.get(arr2[j]);
                sample += 1;
                df2.put(arr2[j], sample);
            } else {
                df2.put(arr2[j], 1);
            }
        }
        eucledianNorm(df1);
        eucledianNorm(df2);
        dotProduct(df1, df2);
        double ouput;
        ouput = dotProduct(df1, df2) / (eucledianNorm(df1) * eucledianNorm(df2));
        return Math.round(ouput * 100);

    }
    double eucledianNorm(HashMap ash) {
        double valy;
        List<Integer> list1 = new ArrayList<Integer>();
        for (Object key : ash.keySet()) {
            list1.add((Integer)ash.get(key));
        }
        Integer[] arra = list1.toArray(new Integer[list1.size()]);
        int no = 0;
        for (int e : arra) {
            no += Math.pow(e, 2);

        }
        valy = Math.sqrt(no);
        return valy;
    }
    int dotProduct(HashMap ash1, HashMap ash2) {
        int dot = 0;
        for (Object key1 : ash1.keySet()) {
            for (Object key2 : ash2.keySet()) {
                if (key1.equals(key2)) {
                    dot += (Integer)ash1.get(key1) * (Integer)ash2.get(key1);
                }
            }
        }
        return dot;
    }


}
