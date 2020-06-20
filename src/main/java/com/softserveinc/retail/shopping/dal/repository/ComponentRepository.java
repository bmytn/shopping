package com.softserveinc.retail.shopping.dal.repository;

import com.softserveinc.retail.shopping.dal.models.Component;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentRepository extends JpaRepository<Component, Integer> {
    Component getComponentById(Integer id);

    Component getComponentByName(String name);
}
