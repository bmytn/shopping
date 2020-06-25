package com.softserveinc.retail.shopping;

import com.softserveinc.retail.shopping.dal.RestaurantDAO;
import com.softserveinc.retail.shopping.dal.models.Component;
import com.softserveinc.retail.shopping.dal.models.Dish;
import com.softserveinc.retail.shopping.dal.models.RestaurantEntity;
import com.softserveinc.retail.shopping.dal.repository.ComponentRepository;
import com.softserveinc.retail.shopping.dal.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.softserveinc.retail.shopping.dal",
				"com.softserveinc.retail.shopping.bl",
				"com.softserveinc.retail.shopping.rest"})
@EnableJpaRepositories(basePackages = "com.softserveinc.retail.shopping.dal.repository")
public class ShoppingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}

	@Autowired
	private RestaurantDAO restaurantDAO;

	@Autowired
	private DishRepository dishRepository;

	@Autowired
	private ComponentRepository componentRepository;

	@Override
	public void run(String ...args){
//		RestaurantEntity restaurant = restaurantDAO.getRestaurantsById(1);
//		System.out.println(restaurant.getName());
//		restaurant = restaurantDAO.getRestaurant(restaurant);
//		System.out.println(restaurant.getName());
//
//		// Dishes
//		System.out.println(dishRepository.fetchDishesById(1).get(0).getName());
//		Dish dish = dishRepository.getDishById(2);
//
//		Component component = componentRepository.getComponentById(3);
//
//		for(Dish d:component.getDishes()){
//			System.out.println(d.getName());
//		}
	}

}
