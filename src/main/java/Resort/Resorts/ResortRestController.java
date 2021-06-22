package Resort.Resorts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResortRestController {
    @Autowired
    private ResortService resortService;
    @GetMapping("/resort")
    public List<Resort> listResort(){
        return resortService.listResort();
    }
    @PostMapping("/resort")
    public Resort addResort(@RequestBody Resort resort){
        System.out.println(resort);
        return resortService.addResort(resort);
    }
}
