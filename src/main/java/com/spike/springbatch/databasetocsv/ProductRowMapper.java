package com.spike.springbatch.databasetocsv;

import com.spike.springbatch.databasetocsv.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        String name = resultSet.getString("name");
        BigDecimal price = resultSet.getBigDecimal("price");

        return new Product(name, price);
    }
}
