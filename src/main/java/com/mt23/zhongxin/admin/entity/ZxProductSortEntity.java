package com.mt23.zhongxin.admin.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "zx_product_sort", schema = "ag_admin", catalog = "")
public class ZxProductSortEntity {
    private int id;
    private String title;
    private int parentId;
    private String iconHref;
    private String type;
    private String description;
    private String enabled;
    private Timestamp crtTime;
    private String crtUser;
    private String crtName;
    private String crtHost;
    private Timestamp updTime;
    private String updUser;
    private String updName;
    private String updHost;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "parent_id")
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "icon_href")
    public String getIconHref() {
        return iconHref;
    }

    public void setIconHref(String iconHref) {
        this.iconHref = iconHref;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    @Column(name = "enabled")
    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Basic
    @Column(name = "crt_time")
    public Timestamp getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Timestamp crtTime) {
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
    @Column(name = "crt_name")
    public String getCrtName() {
        return crtName;
    }

    public void setCrtName(String crtName) {
        this.crtName = crtName;
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
    @Column(name = "upd_time")
    public Timestamp getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Timestamp updTime) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZxProductSortEntity that = (ZxProductSortEntity) o;

        if (id != that.id) return false;
        if (parentId != that.parentId) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (iconHref != null ? !iconHref.equals(that.iconHref) : that.iconHref != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;
        if (crtTime != null ? !crtTime.equals(that.crtTime) : that.crtTime != null) return false;
        if (crtUser != null ? !crtUser.equals(that.crtUser) : that.crtUser != null) return false;
        if (crtName != null ? !crtName.equals(that.crtName) : that.crtName != null) return false;
        if (crtHost != null ? !crtHost.equals(that.crtHost) : that.crtHost != null) return false;
        if (updTime != null ? !updTime.equals(that.updTime) : that.updTime != null) return false;
        if (updUser != null ? !updUser.equals(that.updUser) : that.updUser != null) return false;
        if (updName != null ? !updName.equals(that.updName) : that.updName != null) return false;
        if (updHost != null ? !updHost.equals(that.updHost) : that.updHost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + parentId;
        result = 31 * result + (iconHref != null ? iconHref.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        result = 31 * result + (crtTime != null ? crtTime.hashCode() : 0);
        result = 31 * result + (crtUser != null ? crtUser.hashCode() : 0);
        result = 31 * result + (crtName != null ? crtName.hashCode() : 0);
        result = 31 * result + (crtHost != null ? crtHost.hashCode() : 0);
        result = 31 * result + (updTime != null ? updTime.hashCode() : 0);
        result = 31 * result + (updUser != null ? updUser.hashCode() : 0);
        result = 31 * result + (updName != null ? updName.hashCode() : 0);
        result = 31 * result + (updHost != null ? updHost.hashCode() : 0);
        return result;
    }
}
