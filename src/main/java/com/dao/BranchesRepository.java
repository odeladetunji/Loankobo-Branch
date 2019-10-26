package com.dao;

import com.entity.Branches;
import org.springframework.data.repository.CrudRepository;

public interface BranchesRepository extends CrudRepository<Branches, Long> {
}
