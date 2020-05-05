package com.example.udiploma.Model;

public class InstituteDetails {
    private String principal, poly,  fax, mobile, email, web, location;

    public InstituteDetails()
    {
    }

    public InstituteDetails(String principal, String poly, String fax, String mobile, String email, String web, String location) {
        this.principal = principal;
        this.poly = poly;
        this.fax = fax;
        this.mobile = mobile;
        this.email = email;
        this.web = web;
        this.location = location;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getPoly() {
        return poly;
    }

    public void setPoly(String poly) {
        this.poly = poly;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
