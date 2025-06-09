package com.project.factory;

import com.project.entity.GeometricEntity;
import com.project.entity.Point;

public interface GeometricEntitiesFactory {
//
//    Point createPoint(long id, int x, int y);
//
//    Point createPoint(String name, int x, int y);
//    Triangle createTriangle(String name, Point pointOne, Point pointTwo, Point pointThree);
//
//    Triangle createTriangle(long id, Point pointOne, Point pointTwo, Point pointThree);

    GeometricEntity createGeometricEntity(String type);

    GeometricEntity createGeometricEntity(long id, int x, int y);

    GeometricEntity createGeometricEntity(String name, int x, int y);

    GeometricEntity createGeometricEntity(long id, Point pointOne, Point pointTwo, Point pointThree);

    GeometricEntity createGeometricEntity(String name, Point pointOne, Point pointTwo, Point pointThree);
}
