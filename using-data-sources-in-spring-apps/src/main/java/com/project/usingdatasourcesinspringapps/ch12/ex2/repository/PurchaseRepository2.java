package com.project.usingdatasourcesinspringapps.ch12.ex2.repository;

import com.project.usingdatasourcesinspringapps.ch12.ex2.model.Purchase2;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PurchaseRepository2 {

    private final JdbcTemplate jdbc;

    public PurchaseRepository2(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void storePurchase(Purchase2 purchase2) {
        String sql = "INSERT INTO purchase VALUES (NULL, ?, ?)";
        jdbc.update(sql, purchase2.getProduct(), purchase2.getPrice());
    }

    public List<Purchase2> findAllPurchases() {
        String sql = "SELECT * FROM purchase";

        RowMapper<Purchase2> purchaseRowMapper = (r, i) -> {
            Purchase2 rowObject = new Purchase2();
            rowObject.setId(r.getInt("id"));
            rowObject.setProduct(r.getString("product"));
            rowObject.setPrice(r.getBigDecimal("price"));
            return rowObject;
        };
        return jdbc.query(sql, purchaseRowMapper);
    }
}