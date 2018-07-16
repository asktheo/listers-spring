package pro.theori.netfugl.users;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Document(collection = "person")
public class Person {
    @Id
    private ObjectId _id;

    private long profileId;
    private String firstName;
    private String lastName;
    private String initials;
    private String nickName;
    private String description;
    private String work;
    private String dreamBirds;
    private int yearOfBirth;
    private ArrayList<Accessory> accessories;
    private ContactInfo contactInfo;

    public Person(){
    }

    public Person(long id, String firstName, String lastName, int yearOfBirth) {
        this.profileId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
}