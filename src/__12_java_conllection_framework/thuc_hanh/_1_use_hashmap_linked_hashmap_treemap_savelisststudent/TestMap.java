package __12_java_conllection_framework.thuc_hanh._1_use_hashmap_linked_hashmap_treemap_savelisststudent;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {

        // use hash map:
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("cook", 29);

        System.out.println("Display entries in hash map");
        System.out.println(hashMap +"\n");

        // tree map lưu thứ tự key giảm dần:

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending of key: ");
        System.out.println(treeMap);

        // tạo linked hash map để lưu danh sách sinh viên và hiển thị dữ liệu:

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);

        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
