package fauxspring;

import guru.springframework.sfgpetclinic.fauxspring.Model;

import java.util.HashMap;
import java.util.Map;

public class ModelMapImplementation implements Model {
    Map<String, Object> map = new HashMap<>();

    @Override
    public void addAttribute(String key, Object o){
        map.put(key, o);
    }

    @Override
    public void addAttribute(Object o) {
        //nothing
    }

}
