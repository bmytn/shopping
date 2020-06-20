package com.softserveinc.retail.shopping.dal.models;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Component {

    @Id
    private Integer id;

    private String name;

    @ManyToMany(mappedBy = "components")
    @Fetch(FetchMode.JOIN)
    private List<Dish> dishes;

    public Component(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public Component() {}

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

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

}
