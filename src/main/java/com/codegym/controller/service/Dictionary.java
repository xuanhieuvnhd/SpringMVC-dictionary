package com.codegym.controller.service;

import java.util.HashMap;

public class Dictionary implements IDictionary {
    private HashMap<String, String> dictionary = new HashMap<>();

    public Dictionary() {
        dictionary.put("hello", "Xin Chao");
        dictionary.put("bye", "Tam Biet");
    }

    @Override
    public boolean add(String eng, String vni) {
        if (dictionary.containsKey(eng)) {
            return false;
        } else {
            dictionary.put(eng, vni);
            return true;
        }
    }

    @Override
    public boolean remove(String eng) {
        if (dictionary.containsKey(eng)) {
            dictionary.remove(eng);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean update(String eng, String vni) {
        if (dictionary.containsKey(eng)) {
            dictionary.put(eng, vni);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String find(String eng) {
        if(dictionary.containsKey(eng)){
            return dictionary.get(eng);
        }else {
            return "Khong tim thay!";
        }
    }
}
