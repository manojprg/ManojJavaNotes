package immutable;

import java.util.HashMap;
import java.util.Iterator;

public class MainStudent1 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("1", "Manoj");
        hm.put("2", "Avyaansh");
        Student1 stu = new Student1(1, "manoj", hm);
        System.out.println("stu id " + stu.getId() + " name " + stu.getName());
        HashMap<String, String> hmtemp = stu.getMap();
        hmtemp.put("3", "Bhawna");
        Iterator<String> itr = hm.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println("key " + key + " value " + hm.get(key));
        }

    }
}
