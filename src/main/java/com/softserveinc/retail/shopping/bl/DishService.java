package com.softserveinc.retail.shopping.bl;

import com.softserveinc.retail.shopping.DishNotFoundException;
import com.softserveinc.retail.shopping.dal.models.Dish;
import com.softserveinc.retail.shopping.dal.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {
    @Autowired
    private DishRepository dishRepository;

    public List<Dish> getDishes() {
        return dishRepository.findAll();
    }

    public Dish getDishById(Integer id){
        return dishRepository.findById(id).orElseThrow(DishNotFoundException::new);
    }

    public Dish addDish(Dish dish){
        if(exists(dish)){
            return getDishById(dish.getId());
        }
        return dishRepository.saveAndFlush(dish);
    }

    public Dish updateDish(Dish dish){
        if(exists(dish)){
            return dishRepository.saveAndFlush(dish);
        }
        throw new DishNotFoundException();
    }

    public boolean exists(Dish dish){
        return dishRepository.existsById(dish.getId());
    }
}
