package cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n03.repository;

import cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n03.entity.Fruit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface FruitRespository extends MongoRepository<Fruit, Integer> {

}
