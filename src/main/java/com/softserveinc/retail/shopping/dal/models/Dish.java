package com.softserveinc.retail.shopping.dal.models;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NamedNativeQuery;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    public Dish(String name) {
        this.name = name;
    }

    public Dish(){}

    @ManyToMany
    @Fetch(FetchMode.JOIN)
    private List<Component> components;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

}
