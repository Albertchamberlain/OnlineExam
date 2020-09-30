package com.amos.pojo;

import java.util.List;

/**
 * @author Amos
 * 一级目录
 */
public class Point1  {
    private long id;
    private String pointname;
    private List<Point2> point2;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPointname() {
        return pointname;
    }

    public void setPointname(String pointname) {
        this.pointname = pointname;
    }

    public List<Point2> getPoint2() {
        return point2;
    }

    public void setPoint2(List<Point2> point2) {
        this.point2 = point2;
    }
}
