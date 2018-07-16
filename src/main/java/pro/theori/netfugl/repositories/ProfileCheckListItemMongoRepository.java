package pro.theori.netfugl.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import pro.theori.netfugl.userlists.ProfileCheckListItem;

import java.util.List;

public interface ProfileCheckListItemMongoRepository extends MongoRepository<ProfileCheckListItem, Integer> {
    List<ProfileCheckListItem> findBySpeciesId(int species_id);
    List<ProfileCheckListItem> findByProfileId(int profile_id);
}
