package model;

public interface AbstractFactory<T> {

    T create(String type);
}
