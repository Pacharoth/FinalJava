package Resort.Resorts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResortController {
    @CrossOrigin(origins ="http://localhost:8080")
    @GetMapping("/")
    public String addPerson(){
        return "addPage";
    }
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/listmember")
    public String listPeople(){
        return "listPage";
    }
}
