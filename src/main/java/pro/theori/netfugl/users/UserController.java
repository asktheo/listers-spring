package pro.theori.netfugl.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.theori.netfugl.repositories.PersonMongoRepository;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {

    @Autowired
    private PersonMongoRepository personMongoRepository;

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/profiles")
    public List<Person> profiles(){
        return personMongoRepository.findAll();
    }

    @RequestMapping("/profile")
    public Person profile(@RequestParam(value="id", defaultValue="0") int id){
        return personMongoRepository.findByProfileId(id);
    }
}
