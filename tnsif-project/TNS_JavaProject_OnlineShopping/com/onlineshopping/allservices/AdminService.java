package com.onlineshopping.allservices;

import java.util.*;

import com.onlineshopping.entities.Admin;

public class AdminService {
    private List<Admin> admins = new ArrayList<>();

    public void addAdmin(Admin admin) {
        admins.add(admin);
    }

    public List<Admin> getAllAdmins() {
        return admins;
    }
}
