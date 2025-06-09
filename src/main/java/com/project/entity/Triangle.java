package com.project.entity;

import java.util.Objects;

public class Triangle implements GeometricEntity{
    private long id;
    private String name;
    private final Point pointOne;
    private final Point pointTwo;
    private final Point pointThree;

    public Triangle(String name, Point pointOne, Point pointTwo, Point pointThree) {
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
