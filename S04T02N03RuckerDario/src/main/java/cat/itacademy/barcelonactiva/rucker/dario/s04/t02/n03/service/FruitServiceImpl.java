package cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n03.service;

import cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n03.entity.Fruit;
import cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n03.repository.FruitRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements IFuritService{

    //@Autowired
    private FruitRespository fruitRepository;

    @Override
    public Fruit createFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit updateFruit(Fruit fruit) {
        Fruit fruitDB = getFruit(fruit.getId());
        if(null == fruitDB){
            return null;
        }

        fruitDB.setName(fruit.getName());
        fruitDB.setQuantityKilos(fruit.getQuantityKilos());
        return fruitRepository.save(fruitDB);
    }

    @Override
    public void deleteFruit(int id) {
        Fruit fruitToDelete = fruitRepository.findById(id).get();
        fruitRepository.delete(fruitToDelete);
    }

    @Override
    public Fruit getFruit(int id) {
        return fruitRepository.findById(id).orElse(null);
    }

    @Override
    public List<Fruit> allFruit() {
        return fruitRepository.findAll();
    }

}
