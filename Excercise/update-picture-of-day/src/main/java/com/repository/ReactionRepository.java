package com.repository;

import com.model.Reaction;
import org.springframework.data.repository.CrudRepository;

public interface ReactionRepository extends CrudRepository<Reaction, Long> {
}
