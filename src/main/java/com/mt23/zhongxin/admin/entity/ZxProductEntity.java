package com.mt23.zhongxin.admin.entity;

import javax.persistence.*;

@Entity
@Table(name = "zx_product", schema = "ag_admin", catalog = "")
public class ZxProductEntity {
    private int id;
    private String name;
    private String pictureUris;
    private String mainPictureUri;
    private String description;
    private String crtTime;
    private String crtUser;
    private String crtHost;
    private String crtName;
    private String updTime;
    private String updUser;
    private String updName;
    private String updHost;
    private String detail;

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
    @Column(name = "picture_uris")
    public String getPictureUris() {
        return pictureUris;
    }

    public void setPictureUris(String pictureUris) {
        this.pictureUris = pictureUris;
    }

    @Basic
    @Column(name = "main_picture_uri")
    public String getMainPictureUri() {
        return mainPictureUri;
    }

    public void setMainPictureUri(String mainPictureUri) {
        this.mainPictureUri = mainPictureUri;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "detail")
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZxProductEntity that = (ZxProductEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (pictureUris != null ? !pictureUris.equals(that.pictureUris) : that.pictureUris != null) return false;
        if (mainPictureUri != null ? !mainPictureUri.equals(that.mainPictureUri) : that.mainPictureUri != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (crtTime != null ? !crtTime.equals(that.crtTime) : that.crtTime != null) return false;
        if (crtUser != null ? !crtUser.equals(that.crtUser) : that.crtUser != null) return false;
        if (crtHost != null ? !crtHost.equals(that.crtHost) : that.crtHost != null) return false;
        if (crtName != null ? !crtName.equals(that.crtName) : that.crtName != null) return false;
        if (updTime != null ? !updTime.equals(that.updTime) : that.updTime != null) return false;
        if (updUser != null ? !updUser.equals(that.updUser) : that.updUser != null) return false;
        if (updName != null ? !updName.equals(that.updName) : that.updName != null) return false;
        if (updHost != null ? !updHost.equals(that.updHost) : that.updHost != null) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pictureUris != null ? pictureUris.hashCode() : 0);
        result = 31 * result + (mainPictureUri != null ? mainPictureUri.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (crtTime != null ? crtTime.hashCode() : 0);
        result = 31 * result + (crtUser != null ? crtUser.hashCode() : 0);
        result = 31 * result + (crtHost != null ? crtHost.hashCode() : 0);
        result = 31 * result + (crtName != null ? crtName.hashCode() : 0);
        result = 31 * result + (updTime != null ? updTime.hashCode() : 0);
        result = 31 * result + (updUser != null ? updUser.hashCode() : 0);
        result = 31 * result + (updName != null ? updName.hashCode() : 0);
        result = 31 * result + (updHost != null ? updHost.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        return result;
    }
}
