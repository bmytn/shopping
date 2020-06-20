package com.softserveinc.retail.shopping.dal.models;

public class RestaurantEntity {
    private String name;

    private Integer id;

    public RestaurantEntity(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public RestaurantEntity(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
