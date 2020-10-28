package org.solent.com504.factoryandfacade.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.impl.AnimalObjectFactory;
import org.solent.com504.factoryandfacade.model.Cat;
import org.solent.com504.factoryandfacade.model.Cow;
import org.solent.com504.factoryandfacade.model.Dog;
import org.solent.com504.factoryandfacade.model.FarmFacade;

/**
 *
 * @author cgallen
 */
public class FarmFacadeTest {

    @Test
    public void FarmFacadeTest() {

        FarmFacade farmFacade = AnimalObjectFactory.getFarmFacade();
        assertNotNull(farmFacade);
        
        // WHAT TESTS WOULD YOU CREATE HERE TO SET UP AND TEST THE FARM FACADE?

    }
    
    @Test
    public void FarmFacadeAddDogTest(){
        //Expected
        List<Animal> animals = new ArrayList<>();
        Animal expected = new Dog();
        expected.setName("fido");

        //Actual
        FarmFacade farmFacade = AnimalObjectFactory.getFarmFacade();
        farmFacade.addDog("fido");
        List<Animal> facadeAnimals = farmFacade.getAllAnimals();
        for (int i = 0; i > facadeAnimals.size(); i++){
            if(facadeAnimals.toArray()[i] == expected)
            {
                assertEquals(facadeAnimals.toArray()[i], expected);
            }
        }
    }
    
    @Test
    public void FarmFacadeAddCatTest(){
        //Expected
        List<Animal> animals = new ArrayList<>();
        Animal expected = new Cat();
        expected.setName("fido");

        //Actual
        FarmFacade farmFacade = AnimalObjectFactory.getFarmFacade();
        farmFacade.addCat("fido");
        List<Animal> facadeAnimals = farmFacade.getAllAnimals();
        for (int i = 0; i > facadeAnimals.size(); i++){
            if(facadeAnimals.toArray()[i] == expected)
            {
                assertEquals(facadeAnimals.toArray()[i], expected);
            }
        }
    }
    
    @Test
    public void FarmFacadeAddCowTest(){
        //Expected
        List<Animal> animals = new ArrayList<>();
        Animal expected = new Cow();
        expected.setName("fido");

        //Actual
        FarmFacade farmFacade = AnimalObjectFactory.getFarmFacade();
        farmFacade.addCow("fido");
        List<Animal> facadeAnimals = farmFacade.getAllAnimals();
        for (int i = 0; i > facadeAnimals.size(); i++){
            if(facadeAnimals.toArray()[i] == expected)
            {
                assertEquals(facadeAnimals.toArray()[i], expected);
            }
            else{
                fail();
            }
        }
    }
}
