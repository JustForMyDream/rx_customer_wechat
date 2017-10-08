package com.rx.webApplication.entities;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by 王玉粮 on 2017/6/23.
 */
public class TlkQdcpEntity {
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
    private String id;
    private String itemQdid;
    private String itemCpmc;
    private String itemCpbmid;
    private String itemCpjlid;
    private String itemZhryid;
    private String itemCpzxid;
    private String itemFked;
    private Date itemFkrq;
    private Date itemHkrq;
    private String itemSfds;
    private String itemJjly;
    private String itemFgs;
    private String itemCpid;
    private String itemSfsh;
    private String itemHfr;
    private String itemTxr;
    private String itemDlcsr;
    private String itemCpjg;
    private String itemRzsj;
    private String itemFkxx;
    private String itemShjg;
    private String itemHfbm;
    private String itemTxbm;
    private String itemDlcsbm;
    private String itemSfyq;
    private Date itemHffpsj;
    private Date itemTxfpsj;
    private Date itemDlcsfpsj;
    private String itemZdfpsj;
    private String itemSfbs;

    public TlkQdcpEntity() {
    }

    public TlkQdcpEntity(String itemFgs, String itemCpmc, String itemCpzxid, String itemCpjlid, String id) {
        this.itemFgs = itemFgs;
        this.itemCpmc = itemCpmc;
        this.itemCpzxid = itemCpzxid;
        this.itemCpjlid = itemCpjlid;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemQdid() {
        return itemQdid;
    }

    public void setItemQdid(String itemQdid) {
        this.itemQdid = itemQdid;
    }

    public String getItemCpmc() {
        return itemCpmc;
    }

    public void setItemCpmc(String itemCpmc) {
        this.itemCpmc = itemCpmc;
    }

    public String getItemCpbmid() {
        return itemCpbmid;
    }

    public void setItemCpbmid(String itemCpbmid) {
        this.itemCpbmid = itemCpbmid;
    }

    public String getItemCpjlid() {
        return itemCpjlid;
    }

    public void setItemCpjlid(String itemCpjlid) {
        this.itemCpjlid = itemCpjlid;
    }

    public String getItemZhryid() {
        return itemZhryid;
    }

    public void setItemZhryid(String itemZhryid) {
        this.itemZhryid = itemZhryid;
    }

    public String getItemCpzxid() {
        return itemCpzxid;
    }

    public void setItemCpzxid(String itemCpzxid) {
        this.itemCpzxid = itemCpzxid;
    }

    public String getItemFked() {
        return itemFked;
    }

    public void setItemFked(String itemFked) {
        this.itemFked = itemFked;
    }

    public Date getItemFkrq() {
        return itemFkrq;
    }

    public void setItemFkrq(Date itemFkrq) {
        this.itemFkrq = itemFkrq;
    }

    public Date getItemHkrq() {
        return itemHkrq;
    }

    public void setItemHkrq(Date itemHkrq) {
        this.itemHkrq = itemHkrq;
    }

    public String getItemSfds() {
        return itemSfds;
    }

    public void setItemSfds(String itemSfds) {
        this.itemSfds = itemSfds;
    }

    public String getItemJjly() {
        return itemJjly;
    }

    public void setItemJjly(String itemJjly) {
        this.itemJjly = itemJjly;
    }

    public String getItemFgs() {
        return itemFgs;
    }

    public void setItemFgs(String itemFgs) {
        this.itemFgs = itemFgs;
    }

    public String getItemCpid() {
        return itemCpid;
    }

    public void setItemCpid(String itemCpid) {
        this.itemCpid = itemCpid;
    }

    public String getItemSfsh() {
        return itemSfsh;
    }

    public void setItemSfsh(String itemSfsh) {
        this.itemSfsh = itemSfsh;
    }

    public String getItemHfr() {
        return itemHfr;
    }

    public void setItemHfr(String itemHfr) {
        this.itemHfr = itemHfr;
    }

    public String getItemTxr() {
        return itemTxr;
    }

    public void setItemTxr(String itemTxr) {
        this.itemTxr = itemTxr;
    }

    public String getItemDlcsr() {
        return itemDlcsr;
    }

    public void setItemDlcsr(String itemDlcsr) {
        this.itemDlcsr = itemDlcsr;
    }

    public String getItemCpjg() {
        return itemCpjg;
    }

    public void setItemCpjg(String itemCpjg) {
        this.itemCpjg = itemCpjg;
    }

    public String getItemRzsj() {
        return itemRzsj;
    }

    public void setItemRzsj(String itemRzsj) {
        this.itemRzsj = itemRzsj;
    }

    public String getItemFkxx() {
        return itemFkxx;
    }

    public void setItemFkxx(String itemFkxx) {
        this.itemFkxx = itemFkxx;
    }

    public String getItemShjg() {
        return itemShjg;
    }

    public void setItemShjg(String itemShjg) {
        this.itemShjg = itemShjg;
    }

    public String getItemHfbm() {
        return itemHfbm;
    }

    public void setItemHfbm(String itemHfbm) {
        this.itemHfbm = itemHfbm;
    }

    public String getItemTxbm() {
        return itemTxbm;
    }

    public void setItemTxbm(String itemTxbm) {
        this.itemTxbm = itemTxbm;
    }

    public String getItemDlcsbm() {
        return itemDlcsbm;
    }

    public void setItemDlcsbm(String itemDlcsbm) {
        this.itemDlcsbm = itemDlcsbm;
    }

    public String getItemSfyq() {
        return itemSfyq;
    }

    public void setItemSfyq(String itemSfyq) {
        this.itemSfyq = itemSfyq;
    }

    public Date getItemHffpsj() {
        return itemHffpsj;
    }

    public void setItemHffpsj(Date itemHffpsj) {
        this.itemHffpsj = itemHffpsj;
    }

    public Date getItemTxfpsj() {
        return itemTxfpsj;
    }

    public void setItemTxfpsj(Date itemTxfpsj) {
        this.itemTxfpsj = itemTxfpsj;
    }

    public Date getItemDlcsfpsj() {
        return itemDlcsfpsj;
    }

    public void setItemDlcsfpsj(Date itemDlcsfpsj) {
        this.itemDlcsfpsj = itemDlcsfpsj;
    }

    public String getItemZdfpsj() {
        return itemZdfpsj;
    }

    public void setItemZdfpsj(String itemZdfpsj) {
        this.itemZdfpsj = itemZdfpsj;
    }

    public String getItemSfbs() {
        return itemSfbs;
    }

    public void setItemSfbs(String itemSfbs) {
        this.itemSfbs = itemSfbs;
    }
}
