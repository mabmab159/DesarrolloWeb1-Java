package com.cibertec.clase3.infrastructure.database.repositories;

import com.cibertec.clase3.infrastructure.database.dto.AlumnEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnRepository extends CrudRepository<AlumnEntity, Long> {
}
