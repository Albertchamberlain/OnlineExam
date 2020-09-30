package com.amos.pojo;


/**
 * Know Point
 * @author Amos
 * 二级目录
 */
public class Point2 {
    private long bid;
    private Long aid;
    private String pname;

    @Override
    public String toString() {
        return "Point2{" +
                "bid=" + bid +
                ", aid=" + aid +
                ", pname='" + pname + '\'' +
                '}';
    }

    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
