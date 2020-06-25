package com.softserveinc.retail.shopping.rest;

import com.softserveinc.retail.shopping.DishNotFoundException;
import com.softserveinc.retail.shopping.bl.DishService;
import com.softserveinc.retail.shopping.dal.models.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/dish")
public class DishController {

    @Autowired
    private DishService dishService;

    @GetMapping(path = "/")
    public List<Dish> getDishes() {
        return dishService.getDishes();
    }

    @PutMapping(path = "/")
    public Dish updateDish(@RequestBody Dish dish){
        return dishService.updateDish(dish);
    }

    @PostMapping(path = "/")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Dish saveDish(@RequestBody Dish dish){
        return dishService.addDish(dish);
    }

    @GetMapping(path = "/{id}")
    public Dish getDishById(@PathVariable Integer id) {
        return dishService.getDishById(id);
    }

}
