package app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import app.model.Turnover;

public interface TurnoverRepository extends MongoRepository<Turnover, String> {

}
