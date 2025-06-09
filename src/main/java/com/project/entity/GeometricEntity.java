package com.project.entity;

public interface GeometricEntity {

    long getId();

    void setId(long id);

    String getName();

    @Override
    String toString();

    @Override
    boolean equals(Object another);

    @Override
    int hashCode();
}
