package safe;

import unsafe.Fonctions;

import java.util.HashMap;
import java.util.Map;

public class ShortSet {
    public static void main (String[] args) {
        Map<String, String> map = new HashMap<>();
        String res = make();
        if (res != null){
            log(res);
        }
        log(Fonctions.make());
//        log(map.get("coucou"));
    }

    static void log(Object x) {
        System.out.println(x.toString());
    }

    @Nullable
    static String make(){
        return null;
    }
}