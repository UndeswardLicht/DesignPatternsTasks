package com.project.Entities;

import java.util.Objects;

public class Point {
    private int xAxis;
    private int yAxis;

    public Point(int xAxis, int yAxis) {
        this.xAxis=xAxis;
        this.yAxis=yAxis;
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


