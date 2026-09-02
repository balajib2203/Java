package Collections;

import java.util.HashSet;

public class Hash {
    static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
         hs.add("a");
         hs.add("bala");
         hs.add("See");
         hs.add("See"); // Duplicates not allowed
         hs.add("See11");
         hs.remove("See11"); // No index in hash
         System.out.println(hs); // The order is not guaranteed. It could appear differently.

    }
}
