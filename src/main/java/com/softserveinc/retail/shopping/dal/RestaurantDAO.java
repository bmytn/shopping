package com.softserveinc.retail.shopping.dal;

import com.softserveinc.retail.shopping.dal.models.RestaurantEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class RestaurantDAO {

    private static final RestaurantMapper RESTAURANT_MAPPER = new RestaurantMapper();

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate npJdbcTemplate;

    public void getRestaurants() {
        jdbcTemplate.execute("SELECT  * FROM RESTAURANTS");
    }

    public RestaurantEntity getRestaurantsById(Integer id){
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("id", id);

        return npJdbcTemplate.queryForObject("SELECT  * FROM RESTAURANTS WHERE id = :id",
                namedParameters, RESTAURANT_MAPPER);
    }

    public RestaurantEntity getRestaurant(RestaurantEntity entity){
        SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(entity);

        return npJdbcTemplate.queryForObject("SELECT  * FROM RESTAURANTS WHERE id = :id and name = :name",
                namedParameters, RESTAURANT_MAPPER);
    }
}

    class RestaurantMapper implements RowMapper<RestaurantEntity>{

        @Override
        public RestaurantEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new RestaurantEntity(rs.getString("name"), rs.getInt("id"));
    }
}
