package com.javabites.learn.aws.dao.repositories;

import com.javabites.learn.aws.dao.entity.VehicleEntity;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<VehicleEntity, Long> {
}
