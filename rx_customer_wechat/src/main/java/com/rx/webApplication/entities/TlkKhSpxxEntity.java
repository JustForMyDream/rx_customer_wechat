package com.rx.webApplication.entities;

import java.sql.Timestamp;

/**
 * Created by 王玉粮 on 2017/6/23.
 */
public class TlkKhSpxxEntity {
    private String parent;
    private Timestamp lastmodified;
    private String formname;
    private String state;
    private String audituser;
    private Timestamp auditdate;
    private String author;
    private String authorDeptIndex;
    private Timestamp created;
    private String formid;
    private Boolean istmp;
    private Integer versions;
    private String applicationid;
    private Integer stateint;
    private String statelabel;
    private String auditornames;
    private String lastflowoperation;
    private String lastmodifier;
    private String domainid;
    private String auditorlist;
    private String statelabelinfo;
    private String prevauditnode;
    private String prevaudituser;
    private String optionitem;
    private String sign;
    private String itemSpdz;
    private String itemSplc;
    private String itemSpxz;
    private String itemKhid;
    private String id;
    private double itemYgje;
    private double itemSpzjsy;
    private double itemSppgjz;
    public TlkKhSpxxEntity(){

    }

    public TlkKhSpxxEntity(String itemSpdz, String itemSplc, String itemSpxz,
                           double itemYgje, double itemSpzjsy, double itemSppgjz,String id) {
        this.id = id;
        this.itemSpdz = itemSpdz;
        this.itemSplc = itemSplc;
        this.itemSpxz = itemSpxz;
        this.itemYgje = itemYgje;
        this.itemSpzjsy = itemSpzjsy;
        this.itemSppgjz = itemSppgjz;
    }
    public void TlkKhSpxxEntitybyid(String itemSpdz, String itemSplc, String itemSpxz,
                           double itemYgje, double itemSpzjsy, double itemSppgjz) {
        this.itemSpdz = itemSpdz;
        this.itemSplc = itemSplc;
        this.itemSpxz = itemSpxz;
        this.itemYgje = itemYgje;
        this.itemSpzjsy = itemSpzjsy;
        this.itemSppgjz = itemSppgjz;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Timestamp getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(Timestamp lastmodified) {
        this.lastmodified = lastmodified;
    }

    public String getFormname() {
        return formname;
    }

    public void setFormname(String formname) {
        this.formname = formname;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAudituser() {
        return audituser;
    }

    public void setAudituser(String audituser) {
        this.audituser = audituser;
    }

    public Timestamp getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Timestamp auditdate) {
        this.auditdate = auditdate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorDeptIndex() {
        return authorDeptIndex;
    }

    public void setAuthorDeptIndex(String authorDeptIndex) {
        this.authorDeptIndex = authorDeptIndex;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public String getFormid() {
        return formid;
    }

    public void setFormid(String formid) {
        this.formid = formid;
    }

    public Boolean getIstmp() {
        return istmp;
    }

    public void setIstmp(Boolean istmp) {
        this.istmp = istmp;
    }

    public Integer getVersions() {
        return versions;
    }

    public void setVersions(Integer versions) {
        this.versions = versions;
    }

    public String getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(String applicationid) {
        this.applicationid = applicationid;
    }

    public Integer getStateint() {
        return stateint;
    }

    public void setStateint(Integer stateint) {
        this.stateint = stateint;
    }

    public String getStatelabel() {
        return statelabel;
    }

    public void setStatelabel(String statelabel) {
        this.statelabel = statelabel;
    }

    public String getAuditornames() {
        return auditornames;
    }

    public void setAuditornames(String auditornames) {
        this.auditornames = auditornames;
    }

    public String getLastflowoperation() {
        return lastflowoperation;
    }

    public void setLastflowoperation(String lastflowoperation) {
        this.lastflowoperation = lastflowoperation;
    }

    public String getLastmodifier() {
        return lastmodifier;
    }

    public void setLastmodifier(String lastmodifier) {
        this.lastmodifier = lastmodifier;
    }

    public String getDomainid() {
        return domainid;
    }

    public void setDomainid(String domainid) {
        this.domainid = domainid;
    }

    public String getAuditorlist() {
        return auditorlist;
    }

    public void setAuditorlist(String auditorlist) {
        this.auditorlist = auditorlist;
    }

    public String getStatelabelinfo() {
        return statelabelinfo;
    }

    public void setStatelabelinfo(String statelabelinfo) {
        this.statelabelinfo = statelabelinfo;
    }

    public String getPrevauditnode() {
        return prevauditnode;
    }

    public void setPrevauditnode(String prevauditnode) {
        this.prevauditnode = prevauditnode;
    }

    public String getPrevaudituser() {
        return prevaudituser;
    }

    public void setPrevaudituser(String prevaudituser) {
        this.prevaudituser = prevaudituser;
    }

    public String getOptionitem() {
        return optionitem;
    }

    public void setOptionitem(String optionitem) {
        this.optionitem = optionitem;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getItemSpdz() {
        return itemSpdz;
    }

    public void setItemSpdz(String itemSpdz) {
        this.itemSpdz = itemSpdz;
    }

    public String getItemSplc() {
        return itemSplc;
    }

    public void setItemSplc(String itemSplc) {
        this.itemSplc = itemSplc;
    }

    public String getItemSpxz() {
        return itemSpxz;
    }

    public void setItemSpxz(String itemSpxz) {
        this.itemSpxz = itemSpxz;
    }

    public String getItemKhid() {
        return itemKhid;
    }

    public void setItemKhid(String itemKhid) {
        this.itemKhid = itemKhid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getItemYgje() {
        return itemYgje;
    }

    public void setItemYgje(double itemYgje) {
        this.itemYgje = itemYgje;
    }

    public double getItemSpzjsy() {
        return itemSpzjsy;
    }

    public void setItemSpzjsy(double itemSpzjsy) {
        this.itemSpzjsy = itemSpzjsy;
    }

    public double getItemSppgjz() {
        return itemSppgjz;
    }

    public void setItemSppgjz(double itemSppgjz) {
        this.itemSppgjz = itemSppgjz;
    }
}
