package cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n03.service;

import cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n03.entity.Fruit;
import cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n03.repository.FruitRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@RequiredArgsConstructor
@Service
public class FruitServiceImpl implements IFuritService{

    @Autowired
    private FruitRespository fruitRepository;

    @Override
    public Fruit createFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit updateFruit(Fruit fruit) {
        Optional<Fruit> fruitDB = getFruit(fruit.getId());
        if(null == fruitDB){
            return null;
        }   else {
            return fruitRepository.save(fruit);
        }
    }

    @Override
    public void deleteFruit(String id) {
        Fruit fruitToDelete = fruitRepository.findById(id).get();
        fruitRepository.delete(fruitToDelete);
    }

    @Override
    public Optional<Fruit> getFruit(String id) {
        return fruitRepository.findById(id);
    }

    @Override
    public List<Fruit> allFruit() {
        return fruitRepository.findAll();
    }

}
