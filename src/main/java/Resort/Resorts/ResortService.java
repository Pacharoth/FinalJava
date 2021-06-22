package Resort.Resorts;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResortService {
    @Autowired
    private ResortRepository resortRepository;
    @Transactional
    public List<Resort> listResort(){
        ArrayList <Resort> resorts = new ArrayList<Resort>();
        resortRepository.findAll().forEach(resorts::add);
        return resorts;
    }
    @Transactional
    public Resort addResort(Resort resort){
        try{
            resortRepository.save(resort);
            return resort; 
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}
