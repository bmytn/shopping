package com.softserveinc.retail.shopping.dal.repository;

import com.softserveinc.retail.shopping.dal.models.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<Dish, Integer> {
//    Dish getByNameAndPriceAndPriceGreaterThan(String name, Integer price);

    Dish getDishById(Integer id);

    @Query(nativeQuery = true, value = "select * from dish where id = :id")
    List<Dish> fetchDishesById(@Param("id") Integer id);
}
