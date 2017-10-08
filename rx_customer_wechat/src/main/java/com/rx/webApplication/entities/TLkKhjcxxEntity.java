package com.rx.webApplication.entities;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by 王玉粮 on 2017/6/23.
 */
public class TLkKhjcxxEntity {
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
    private String itemKhxm;
    private String itemKhxb;
    private String itemSfzhm;
    private String itemHyzk;
    private String itemBz;
    private String itemYwzn;
    private String itemJszxqk;
    private String itemSszx;
    private String itemSsbm;
    private String id;
    private String itemDkyx;
    private String itemZxxx;
    private String itemBrfz;
    private String itemJzdz;
    private String itemKhdj;
    private String itemYwzxyq;
    private String itemYqbs;
    private String itemZylb;
    private Double itemYgzsr;
    private String itemGznx;
    private String itemGzfffs;
    private String itemWhjhid;
    private String itemZxzt;
    private String itemZjhm;
    private String itemSjhm;
    private String itemSsr;
    private String itemJssj;
    private String itemSfqd;
    private String itemSfyjt;
    private String itemLsjhid;
    private String itemFpsj;
    private String itemSfyd;
    private String itemWxh;

    public TLkKhjcxxEntity() {
    }

    public TLkKhjcxxEntity(String id,String itemKhxm, String itemKhxb, String itemSfzhm, String itemZxxx, String itemYwzxyq, String itemYqbs, String itemZylb, Double itemYgzsr, String itemGznx, String itemGzfffs, String itemZjhm, String itemSjhm) {
        this.id=id;
        this.itemKhxm = itemKhxm;
        this.itemKhxb = itemKhxb;
        this.itemSfzhm = itemSfzhm;
        this.itemZxxx = itemZxxx;
        this.itemYwzxyq = itemYwzxyq;
        this.itemYqbs = itemYqbs;
        this.itemZylb = itemZylb;
        this.itemYgzsr = itemYgzsr;
        this.itemGznx = itemGznx;
        this.itemGzfffs = itemGzfffs;
        this.itemZjhm = itemZjhm;
        this.itemSjhm = itemSjhm;
    }

    public TLkKhjcxxEntity(String itemKhxm,String itemSjhm){
        this.itemKhxm = itemKhxm;
        this.itemSjhm = itemSjhm;
    }



    public String getItemWxh() {
        return itemWxh;
    }

    public void setItemWxh(String itemWxh) {
        this.itemWxh = itemWxh;
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

    public String getItemKhxm() {
        return itemKhxm;
    }

    public void setItemKhxm(String itemKhxm) {
        this.itemKhxm = itemKhxm;
    }

    public String getItemKhxb() {
        return itemKhxb;
    }

    public void setItemKhxb(String itemKhxb) {
        this.itemKhxb = itemKhxb;
    }

    public String getItemSfzhm() {
        return itemSfzhm;
    }

    public void setItemSfzhm(String itemSfzhm) {
        this.itemSfzhm = itemSfzhm;
    }

    public String getItemHyzk() {
        return itemHyzk;
    }

    public void setItemHyzk(String itemHyzk) {
        this.itemHyzk = itemHyzk;
    }

    public String getItemBz() {
        return itemBz;
    }

    public void setItemBz(String itemBz) {
        this.itemBz = itemBz;
    }

    public String getItemYwzn() {
        return itemYwzn;
    }

    public void setItemYwzn(String itemYwzn) {
        this.itemYwzn = itemYwzn;
    }

    public String getItemJszxqk() {
        return itemJszxqk;
    }

    public void setItemJszxqk(String itemJszxqk) {
        this.itemJszxqk = itemJszxqk;
    }

    public String getItemSszx() {
        return itemSszx;
    }

    public void setItemSszx(String itemSszx) {
        this.itemSszx = itemSszx;
    }

    public String getItemSsbm() {
        return itemSsbm;
    }

    public void setItemSsbm(String itemSsbm) {
        this.itemSsbm = itemSsbm;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemDkyx() {
        return itemDkyx;
    }

    public void setItemDkyx(String itemDkyx) {
        this.itemDkyx = itemDkyx;
    }

    public String getItemZxxx() {
        return itemZxxx;
    }

    public void setItemZxxx(String itemZxxx) {
        this.itemZxxx = itemZxxx;
    }

    public String getItemBrfz() {
        return itemBrfz;
    }

    public void setItemBrfz(String itemBrfz) {
        this.itemBrfz = itemBrfz;
    }

    public String getItemJzdz() {
        return itemJzdz;
    }

    public void setItemJzdz(String itemJzdz) {
        this.itemJzdz = itemJzdz;
    }

    public String getItemKhdj() {
        return itemKhdj;
    }

    public void setItemKhdj(String itemKhdj) {
        this.itemKhdj = itemKhdj;
    }

    public String getItemYwzxyq() {
        return itemYwzxyq;
    }

    public void setItemYwzxyq(String itemYwzxyq) {
        this.itemYwzxyq = itemYwzxyq;
    }

    public String getItemYqbs() {
        return itemYqbs;
    }

    public void setItemYqbs(String itemYqbs) {
        this.itemYqbs = itemYqbs;
    }

    public String getItemZylb() {
        return itemZylb;
    }

    public void setItemZylb(String itemZylb) {
        this.itemZylb = itemZylb;
    }

    public Double getItemYgzsr() {
        return itemYgzsr;
    }

    public void setItemYgzsr(Double itemYgzsr) {
        this.itemYgzsr = itemYgzsr;
    }

    public String getItemGznx() {
        return itemGznx;
    }

    public void setItemGznx(String itemGznx) {
        this.itemGznx = itemGznx;
    }

    public String getItemGzfffs() {
        return itemGzfffs;
    }

    public void setItemGzfffs(String itemGzfffs) {
        this.itemGzfffs = itemGzfffs;
    }

    public String getItemWhjhid() {
        return itemWhjhid;
    }

    public void setItemWhjhid(String itemWhjhid) {
        this.itemWhjhid = itemWhjhid;
    }

    public String getItemZxzt() {
        return itemZxzt;
    }

    public void setItemZxzt(String itemZxzt) {
        this.itemZxzt = itemZxzt;
    }

    public String getItemZjhm() {
        return itemZjhm;
    }

    public void setItemZjhm(String itemZjhm) {
        this.itemZjhm = itemZjhm;
    }

    public String getItemSjhm() {
        return itemSjhm;
    }

    public void setItemSjhm(String itemSjhm) {
        this.itemSjhm = itemSjhm;
    }

    public String getItemSsr() {
        return itemSsr;
    }

    public void setItemSsr(String itemSsr) {
        this.itemSsr = itemSsr;
    }

    public String getItemJssj() {
        return itemJssj;
    }

    public void setItemJssj(String itemJssj) {
        this.itemJssj = itemJssj;
    }

    public String getItemSfqd() {
        return itemSfqd;
    }

    public void setItemSfqd(String itemSfqd) {
        this.itemSfqd = itemSfqd;
    }

    public String getItemSfyjt() {
        return itemSfyjt;
    }

    public void setItemSfyjt(String itemSfyjt) {
        this.itemSfyjt = itemSfyjt;
    }

    public String getItemLsjhid() {
        return itemLsjhid;
    }

    public void setItemLsjhid(String itemLsjhid) {
        this.itemLsjhid = itemLsjhid;
    }

    public String getItemFpsj() {
        return itemFpsj;
    }

    public void setItemFpsj(String itemFpsj) {
        this.itemFpsj = itemFpsj;
    }

    public String getItemSfyd() {
        return itemSfyd;
    }

    public void setItemSfyd(String itemSfyd) {
        this.itemSfyd = itemSfyd;
    }

    @Override
    public String toString() {
        return "TLkKhjcxxEntity{" +
                ", itemYwzxyq='" + itemYwzxyq + '\'' +
                ", itemYqbs='" + itemYqbs + '\'' +
                ", itemZylb='" + itemZylb + '\'' +
                ", itemYgzsr=" + itemYgzsr +
                ", itemGznx='" + itemGznx + '\'' +
                ", itemGzfffs='" + itemGzfffs + '\'' +
                ", itemKhxm='" + itemKhxm + '\'' +
                ", itemKhxb='" + itemKhxb + '\'' +
                ", itemSfzhm='" + itemSfzhm + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
