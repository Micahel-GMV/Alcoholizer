package com.gudzenko.alcoholizer.repository;

import com.gudzenko.alcoholizer.domain.Bottle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Micahel on 01.06.2017.
 */

@Repository
public interface BottleRepository extends CrudRepository<Bottle,Long>{
}
