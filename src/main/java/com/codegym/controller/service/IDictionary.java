package com.codegym.controller.service;

public interface IDictionary {
    public boolean add(String eng, String vni);
    public boolean remove(String eng);
    public boolean update(String eng, String vni);
    public String find(String eng);

}
