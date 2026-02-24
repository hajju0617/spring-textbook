package com.project.usingdatasourcesinspringapps.ch12.ex3.repository;

import com.project.usingdatasourcesinspringapps.ch12.ex3.model.Purchase3;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PurchaseRepository3 {

    private final JdbcTemplate jdbc;

    public PurchaseRepository3(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void storePurchase(Purchase3 purchase3) {
        String sql = "INSERT INTO purchase VALUES (NULL, ?, ?)";
        jdbc.update(sql, purchase3.getProduct(), purchase3.getPrice());
    }

    public List<Purchase3> findAllPurchases() {
        String sql = "SELECT * FROM purchase";

        RowMapper<Purchase3> purchaseRowMapper = (r, i) -> {
            Purchase3 rowObject = new Purchase3();
            rowObject.setId(r.getInt("id"));
            rowObject.setProduct(r.getString("product"));
            rowObject.setPrice(r.getBigDecimal("price"));
            return rowObject;
        };
        return jdbc.query(sql, purchaseRowMapper);
    }
}