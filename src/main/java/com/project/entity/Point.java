package com.project.entity;

import java.util.Objects;

public class Point implements GeometricEntity{
    private long id;
    private String name;
    private final int xAxis;
    private final int yAxis;

    public Point(long id, int xAxis, int yAxis) {
        this.id=id;
        this.xAxis=xAxis;
        this.yAxis=yAxis;
    }

    public Point(String name, int xAxis, int yAxis) {
        this.name=name;
        this.xAxis=xAxis;
        this.yAxis=yAxis;
    }

    public int getxAxis() {
        return xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point=(Point) o;
        return xAxis == point.xAxis && yAxis == point.yAxis;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xAxis, yAxis);
    }

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("Point{");
        sb.append("xAxis=").append(xAxis);
        sb.append(", yAxis=").append(yAxis);
        sb.append('}');
        return sb.toString();
    }
}


