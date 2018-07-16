package pro.theori.netfugl.userlists;


import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "checkeddk")
public class ProfileCheckListItem {
    @Id
    private ObjectId _id;

    private int profileId;
    private int speciesId;
    private String birdName;
    private String latinBirdName;
    private String date;
    private String location;
    private String latitude;
    private String longitude;
    private String map;

    public ProfileCheckListItem() {
    }

}