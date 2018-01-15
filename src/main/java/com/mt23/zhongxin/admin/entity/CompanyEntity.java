package com.mt23.zhongxin.admin.entity;

import javax.persistence.*;

@Entity
@Table(name = "company", schema = "ag_admin", catalog = "")
public class CompanyEntity {
    private int id;
    private String name;
    private String phone;
    private String telphone;
    private String about;
    private String logo;
    private String email;
    private String address;
    private String contact;
    private String crtTime;
    private String crtUser;
    private String crtHost;
    private String crtName;
    private String updTime;
    private String updUser;
    private String updName;
    private String updHost;
    private String icp;
    private String tagline;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "telphone")
    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    @Basic
    @Column(name = "about")
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Basic
    @Column(name = "logo")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "contact")
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "crt_time")
    public String getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(String crtTime) {
        this.crtTime = crtTime;
    }

    @Basic
    @Column(name = "crt_user")
    public String getCrtUser() {
        return crtUser;
    }

    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser;
    }

    @Basic
    @Column(name = "crt_host")
    public String getCrtHost() {
        return crtHost;
    }

    public void setCrtHost(String crtHost) {
        this.crtHost = crtHost;
    }

    @Basic
    @Column(name = "crt_name")
    public String getCrtName() {
        return crtName;
    }

    public void setCrtName(String crtName) {
        this.crtName = crtName;
    }

    @Basic
    @Column(name = "upd_time")
    public String getUpdTime() {
        return updTime;
    }

    public void setUpdTime(String updTime) {
        this.updTime = updTime;
    }

    @Basic
    @Column(name = "upd_user")
    public String getUpdUser() {
        return updUser;
    }

    public void setUpdUser(String updUser) {
        this.updUser = updUser;
    }

    @Basic
    @Column(name = "upd_name")
    public String getUpdName() {
        return updName;
    }

    public void setUpdName(String updName) {
        this.updName = updName;
    }

    @Basic
    @Column(name = "upd_host")
    public String getUpdHost() {
        return updHost;
    }

    public void setUpdHost(String updHost) {
        this.updHost = updHost;
    }

    @Basic
    @Column(name = "icp")
    public String getIcp() {
        return icp;
    }

    public void setIcp(String icp) {
        this.icp = icp;
    }

    @Basic
    @Column(name = "tagline")
    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompanyEntity that = (CompanyEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (telphone != null ? !telphone.equals(that.telphone) : that.telphone != null) return false;
        if (about != null ? !about.equals(that.about) : that.about != null) return false;
        if (logo != null ? !logo.equals(that.logo) : that.logo != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (contact != null ? !contact.equals(that.contact) : that.contact != null) return false;
        if (crtTime != null ? !crtTime.equals(that.crtTime) : that.crtTime != null) return false;
        if (crtUser != null ? !crtUser.equals(that.crtUser) : that.crtUser != null) return false;
        if (crtHost != null ? !crtHost.equals(that.crtHost) : that.crtHost != null) return false;
        if (crtName != null ? !crtName.equals(that.crtName) : that.crtName != null) return false;
        if (updTime != null ? !updTime.equals(that.updTime) : that.updTime != null) return false;
        if (updUser != null ? !updUser.equals(that.updUser) : that.updUser != null) return false;
        if (updName != null ? !updName.equals(that.updName) : that.updName != null) return false;
        if (updHost != null ? !updHost.equals(that.updHost) : that.updHost != null) return false;
        if (icp != null ? !icp.equals(that.icp) : that.icp != null) return false;
        if (tagline != null ? !tagline.equals(that.tagline) : that.tagline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (telphone != null ? telphone.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        result = 31 * result + (crtTime != null ? crtTime.hashCode() : 0);
        result = 31 * result + (crtUser != null ? crtUser.hashCode() : 0);
        result = 31 * result + (crtHost != null ? crtHost.hashCode() : 0);
        result = 31 * result + (crtName != null ? crtName.hashCode() : 0);
        result = 31 * result + (updTime != null ? updTime.hashCode() : 0);
        result = 31 * result + (updUser != null ? updUser.hashCode() : 0);
        result = 31 * result + (updName != null ? updName.hashCode() : 0);
        result = 31 * result + (updHost != null ? updHost.hashCode() : 0);
        result = 31 * result + (icp != null ? icp.hashCode() : 0);
        result = 31 * result + (tagline != null ? tagline.hashCode() : 0);
        return result;
    }
}
