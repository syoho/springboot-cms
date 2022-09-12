package com.example.springbootcms.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String mail;
    private String address;
    private String phone;

/*    //get,set メソッド
    //win:alt+insert
    //mac:control+enter
    public User(Integer id, String username, String password, String nickname, String mail, String address, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.mail = mail;
        this.address = address;
        this.phone = phone;
    }*/
}
