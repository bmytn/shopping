package com.softserveinc.retail.shopping.dal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Component {

    @Id
    private Integer id;

    private String name;

    @ManyToMany(mappedBy = "components",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Fetch(FetchMode.JOIN)
    @JsonIgnoreProperties("components")
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
