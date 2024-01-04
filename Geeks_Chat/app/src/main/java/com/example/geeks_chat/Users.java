package com.example.geeks_chat;

import android.widget.EditText;

public class Users {


    private String emaill;

    String profilepic,username,password,userId,lastMessage,status;

    public Users()
    {

    }
    public Users(String id, String namee, String emaill, String password, EditText rg_password, String status){
        this.userId=userId;
        this.username=username;
        this.emaill=emaill;
        this.password=password;
        this.status=status;
        this.profilepic=profilepic;


    }



    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
