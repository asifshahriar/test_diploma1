package com.example.udiploma.Model;

public class Upload_notice {
    private String name, notice;

    public Upload_notice()
    {

    }

    public Upload_notice(String name, String notice) {
        this.name = name;
        this.notice = notice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
}
