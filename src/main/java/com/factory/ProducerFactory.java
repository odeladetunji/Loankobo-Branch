package com.factory;

public class ProducerFactory {
    public static AbstractFactory newEntity(){
        return new EntityFactory();
    }
}
