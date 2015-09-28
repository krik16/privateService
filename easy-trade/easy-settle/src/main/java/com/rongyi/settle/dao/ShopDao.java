package com.rongyi.settle.dao;

import com.rongyi.easy.entity.ShopEntity;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShopDao extends BasicDAO<ShopEntity, Object> {

    @Autowired
    public ShopDao(Datastore ds) {
        super(ds);
    }
}
