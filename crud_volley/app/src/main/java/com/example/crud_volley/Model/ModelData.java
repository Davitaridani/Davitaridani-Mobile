package com.example.crud_volley.Model;

/**
 * Created by Ahmat Davit.
 */

public class ModelData {
    String username, grup, nama, password;

    public ModelData() {
    }
    public ModelData(String username, String grup, String nama, String password) {
        this.username = username;
        this.grup = grup;
        this.nama = nama;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGrup() { return grup; }

    public void setGrup(String grup) { this.grup = grup; }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
