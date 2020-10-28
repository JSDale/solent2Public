/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.factoryandfacade.impl;
import java.util.ArrayList;
import java.util.List;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.model.FarmFacade;

public class FactoryAndFacadeImpl implements FarmFacade{

    private List<Animal> animals = new ArrayList<Animal>(); 
    
    @Override
    public List<Animal> getAllAnimals() {
        //if (animals != null){
            return animals;
        //}
        //throw new Exception("animals array is null");
        
    }

    @Override
    public void addDog(String name) {
        Animal newDog = AnimalObjectFactory.createDog();
        newDog.setName(name);
        animals.add(newDog);
    }

    @Override
    public void addCat(String name) {
        Animal newCat = AnimalObjectFactory.createCat();
        newCat.setName(name);
        animals.add(newCat);
    }

    @Override
    public void addCow(String name) {
        Animal newCow = AnimalObjectFactory.createCow();
        newCow.setName(name);
        animals.add(newCow);
    }
    
    @Override
    public void addDuck(String name) {
        Animal newDuck = AnimalObjectFactory.createDuck();
        newDuck.setName(name);
        animals.add(newDuck);
    }
    
}
