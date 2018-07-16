package pro.theori.netfugl.userlists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.theori.netfugl.repositories.ProfileCheckListItemMongoRepository;
import pro.theori.netfugl.repositories.ProfileCheckListItemWpMongoRepository;

import java.util.List;

@RestController
public class ProfileCheckListController {

    @Autowired
    private ProfileCheckListItemMongoRepository profileCheckListItemMongoRepository;

    @Autowired
    private ProfileCheckListItemWpMongoRepository profileCheckListItemWpMongoRepository;

    @RequestMapping("/wpchecklist")
    public List<ProfileCheckListItemWp> wpchecklist(@RequestParam(value="profile_id", defaultValue="0") int profile_id){
        return profileCheckListItemWpMongoRepository.findByProfileId(profile_id);
    }

    @RequestMapping("/dkchecklist")
    public List<ProfileCheckListItem> dkchecklist(@RequestParam(value="profile_id", defaultValue="0") int profile_id){
        return profileCheckListItemMongoRepository.findByProfileId(profile_id);
    }
}
