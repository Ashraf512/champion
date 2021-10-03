package com.champion.repository;

import com.champion.entities.Match;
import com.champion.entities.Participant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends CrudRepository<Match, Integer> {
}
