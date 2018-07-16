package pro.theori.netfugl.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import pro.theori.netfugl.userlists.ProfileCheckListItem;
import pro.theori.netfugl.userlists.ProfileCheckListItemWp;

import java.util.List;

public interface ProfileCheckListItemWpMongoRepository extends MongoRepository<ProfileCheckListItemWp, Integer> {
    List<ProfileCheckListItemWp> findBySpeciesId(int species_id);
    List<ProfileCheckListItemWp> findByCountryId(int country_id);
    List<ProfileCheckListItemWp> findByProfileId(int profile_id);
}
