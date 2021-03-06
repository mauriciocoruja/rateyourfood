package com.mauriciocoruja.rateyourfood.config;

import com.mauriciocoruja.rateyourfood.entities.Dish;
import com.mauriciocoruja.rateyourfood.entities.Establishment;
import com.mauriciocoruja.rateyourfood.entities.Rating;
import com.mauriciocoruja.rateyourfood.entities.enums.Evaluation;
import com.mauriciocoruja.rateyourfood.repositories.DishRepositories;
import com.mauriciocoruja.rateyourfood.repositories.EstablishmentRepositories;
import com.mauriciocoruja.rateyourfood.repositories.RatingRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private DishRepositories dishRepositories;

    @Autowired
    private EstablishmentRepositories establishmentRepositories;

    @Autowired
    private RatingRepositories ratingRepositories;

    @Override
    public void run(String... args) throws Exception {

        Establishment establishment = new Establishment();
        establishment.setName("Burguer King");
        establishment.setAddress("Avenida do Estado, 1111");
        establishment.setPhoneNumber("(11) 99999-9999");

        Dish dish = new Dish();
        dish.setDishName("WHOPPER");
        dish.setDishDescription("Um hamburguer classico");
        dish.setEstablishment(establishment);

        establishmentRepositories.save(establishment);

        Rating rating = new Rating();
        rating.setPrep(Evaluation.BAD);
        rating.setAppearance(Evaluation.VERY_GOOD);
        rating.setFlavor(Evaluation.GOOD);
        rating.setDish(dish);
        rating.setAverageRate(rating.getFlavor().getCode(),rating.getAppearance().getCode(),rating.getPrep().getCode());


        dishRepositories.save(dish);
        ratingRepositories.save(rating);

        dishRepositories.save(dish);

        Rating rating1 = new Rating();
        rating1.setPrep(Evaluation.BAD);
        rating1.setAppearance(Evaluation.TERRIBLE);
        rating1.setFlavor(Evaluation.GOOD);
        rating1.setAverageRate(rating1.getFlavor().getCode(),rating1.getAppearance().getCode(),rating1.getPrep().getCode());
        ratingRepositories.save(rating1);

        Dish dish1 = new Dish(null, "Batata", "Melhor batata", establishment);
        dishRepositories.save(dish1);

        rating1.setDish(dish1);
        ratingRepositories.save(rating1);

        Rating rating2 = new Rating();
        rating2.setPrep(Evaluation.EXCELLENT);
        rating2.setAppearance(Evaluation.VERY_GOOD);
        rating2.setFlavor(Evaluation.GOOD);
        rating2.setAverageRate(rating2.getFlavor().getCode(),rating2.getAppearance().getCode(),rating2.getPrep().getCode());
        ratingRepositories.save(rating2);

        rating2.setDish(dish1);
        ratingRepositories.save(rating2);




    }
}
