package app.SpringBoot.controllers;

import app.SpringBoot.entities.NewTravel;
import app.SpringBoot.services.NewTravelServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/New")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NewTravelController {
    @Autowired
    NewTravelServiceInter newTravelServiceInter;
    @GetMapping("/getAllNews")
    public List<NewTravel> getAllNews() {
        return newTravelServiceInter.getAllNews();
    }
    @GetMapping("/getNewById/{id}")
    public NewTravel getNewById(@PathVariable Long id) {
        return newTravelServiceInter.getNewById(id);
    }
    @PostMapping("/addNew")
    public NewTravel addNew(@RequestBody NewTravel newTravel ){
        return newTravelServiceInter.addNew(newTravel);
    }
    @PutMapping("/updateNew/{id}")
    public NewTravel updateNew(@RequestBody NewTravel newTravel, @PathVariable Long id){
        return newTravelServiceInter.updateNew(newTravel,id);
    }
    // Delete tour
    @DeleteMapping("/deleteN/{id}")
    public void deleteNew(@PathVariable Long id) {
        newTravelServiceInter.deleteNew(id);
    }
}
