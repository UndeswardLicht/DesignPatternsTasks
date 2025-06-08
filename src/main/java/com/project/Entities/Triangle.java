package com.project.Entities;

import java.util.Objects;

public class Triangle {
    private int id;
    private String name;
    private Point pointOne;
    private Point pointTwo;
    private Point pointThree;

    public Triangle(int id, String name, Point pointOne, Point pointTwo, Point pointThree) {
        this.id=id;
        this.name=name;
        this.pointOne=pointOne;
        this.pointTwo=pointTwo;
        this.pointThree=pointThree;
    }

    public Triangle(int id, Point pointOne, Point pointTwo, Point pointThree) {
        this.id=id;
        this.pointOne=pointOne;
        this.pointTwo=pointTwo;
        this.pointThree=pointThree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle=(Triangle) o;
        return id == triangle.id && Objects.equals(name, triangle.name) && Objects.equals(pointOne, triangle.pointOne) && Objects.equals(pointTwo, triangle.pointTwo) && Objects.equals(pointThree, triangle.pointThree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pointOne, pointTwo, pointThree);
    }

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("Triangle{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", pointOne=").append(pointOne);
        sb.append(", pointTwo=").append(pointTwo);
        sb.append(", pointThree=").append(pointThree);
        sb.append('}');
        return sb.toString();
    }
}
