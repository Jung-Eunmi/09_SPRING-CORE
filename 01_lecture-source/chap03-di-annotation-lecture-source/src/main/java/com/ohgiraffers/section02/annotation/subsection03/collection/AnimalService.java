package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.common.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("collectionService")
public class AnimalService {

    // order 로 Component 의 순서를 정하고 싶으면 List 타입이여야한다.
    private final List<Animal> animals;

    @Autowired
    public AnimalService(List<Animal> animals){
        this.animals = animals;
    }

    public void animalEat() {
        for(Animal animal : animals){
            animal.eat();
        }
    }
}
