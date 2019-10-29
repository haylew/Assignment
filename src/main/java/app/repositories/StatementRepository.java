package app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import app.model.Statement;

public interface StatementRepository extends MongoRepository<Statement, String>{

}
