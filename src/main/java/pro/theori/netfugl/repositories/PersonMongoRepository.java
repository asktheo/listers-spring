package pro.theori.netfugl.repositories;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import pro.theori.netfugl.users.Person;

public interface PersonMongoRepository extends MongoRepository<Person, Integer> {
    Person findByProfileId(long profileId);
    Person findByFirstName(String firstName);
    Person findByLastName(String lastName);
}
