package pro.theori.netfugl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pro.theori.netfugl.repositories.PersonMongoRepository;
import pro.theori.netfugl.users.Person;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonMongoRepositoryTest {

    @Autowired
    private PersonMongoRepository userMongoRepository;


    @Before
    public void setUp() throws Exception {
        Person person1 = new Person(196,"Nina","Askov", 1970);
        Person person2 = new Person(1265,"Maja","Elbek", 1996);
        userMongoRepository.insert(person1);
        userMongoRepository.insert(person2);
        //save product, verify has ID value after save
        assertEquals(196, person1.getProfileId());
        assertEquals(1996, person2.getYearOfBirth());
    }

    @Test
    public void testFetchData(){
        /*Test data retrieval*/
        Person personA = userMongoRepository.findByProfileId(196);
        assertNotNull(personA);
        assertEquals(1970, personA.getYearOfBirth());

    }

    @Test
    public void testDataUpdate(){
        /*Test update*/
        Person personB = userMongoRepository.findByFirstName("Maja");
        personB.setYearOfBirth(1999);
        userMongoRepository.save(personB);
        Person personC = userMongoRepository.findByLastName("Elbek");
        assertNotNull(personC);
        assertEquals(1999, personC.getYearOfBirth());
    }

    @After
    public void tearDown() throws Exception {
        Person personA = userMongoRepository.findByProfileId(196);
        this.userMongoRepository.delete(personA);
        Person personB = userMongoRepository.findByProfileId(1265);
        this.userMongoRepository.delete(personB);
    }

}