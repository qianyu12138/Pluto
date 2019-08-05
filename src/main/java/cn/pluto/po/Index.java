package cn.pluto.po;

import java.util.Date;

public class Index {
    private Integer iid;

    private String panaltext;

    private String backgroundmusic;

    private String contactqq;

    private String contectemail;

    private String contectmobile;

    private String contectaddress;

    private Date lastlogin;

    private String sp;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getPanaltext() {
        return panaltext;
    }

    public void setPanaltext(String panaltext) {
        this.panaltext = panaltext == null ? null : panaltext.trim();
    }

    public String getBackgroundmusic() {
        return backgroundmusic;
    }

    public void setBackgroundmusic(String backgroundmusic) {
        this.backgroundmusic = backgroundmusic == null ? null : backgroundmusic.trim();
    }

    public String getContactqq() {
        return contactqq;
    }

    public void setContactqq(String contactqq) {
        this.contactqq = contactqq == null ? null : contactqq.trim();
    }

    public String getContectemail() {
        return contectemail;
    }

    public void setContectemail(String contectemail) {
        this.contectemail = contectemail == null ? null : contectemail.trim();
    }

    public String getContectmobile() {
        return contectmobile;
    }

    public void setContectmobile(String contectmobile) {
        this.contectmobile = contectmobile == null ? null : contectmobile.trim();
    }

    public String getContectaddress() {
        return contectaddress;
    }

    public void setContectaddress(String contectaddress) {
        this.contectaddress = contectaddress == null ? null : contectaddress.trim();
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp == null ? null : sp.trim();
    }
}