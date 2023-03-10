package cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n03.service;

import cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n03.entity.Fruit;

import java.util.List;
import java.util.Optional;

public interface IFuritService {


    Fruit createFruit(Fruit fruit);
    Fruit updateFruit(Fruit fruit);
    void deleteFruit(String id);
    Optional<Fruit> getFruit(String id);
    List<Fruit> allFruit();

}
