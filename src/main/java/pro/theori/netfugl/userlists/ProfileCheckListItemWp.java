package pro.theori.netfugl.userlists;


import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "checkedwp")
public class ProfileCheckListItemWp extends ProfileCheckListItem{

    private int countryId;
    private String country;

    public ProfileCheckListItemWp() {
    }

}