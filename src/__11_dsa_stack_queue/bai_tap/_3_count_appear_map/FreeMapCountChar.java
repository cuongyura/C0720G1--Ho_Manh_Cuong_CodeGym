package __11_dsa_stack_queue.bai_tap._3_count_appear_map;

import java.util.TreeMap;

public class FreeMapCountChar {
    public static void main(String[] args) {
        String string = "đường đời đưa đẩy đi đủ đường!";
        String[] arrays = string.split("\\s");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String temp;
        int count;
        for (String elements : arrays){
            temp = elements.toUpperCase();
            if(treeMap.containsKey(temp)){
                count = treeMap.get(temp);
                treeMap.put(temp, count + 1);
            }else treeMap.put(temp, 1);
        }
        System.out.println(treeMap);
    }
}
