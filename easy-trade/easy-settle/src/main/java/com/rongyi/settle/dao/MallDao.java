package com.rongyi.settle.dao;

import com.rongyi.easy.entity.MallEntity;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MallDao extends BasicDAO<MallEntity, Object> {

    @Autowired
    public MallDao(Datastore ds) {
        super(ds);
    }
}
