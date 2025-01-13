package app.SpringBoot.controllers;

import app.SpringBoot.entities.SpecialPackage;
import app.SpringBoot.entities.Tour;
import app.SpringBoot.services.SpecialPackageServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/specialPackage")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SpecialPackageController {
    @Autowired
    SpecialPackageServiceInter specialPackageServiceInter;
    @GetMapping("/getAllSP")
    public List<SpecialPackage> getAllSP() {
        return specialPackageServiceInter.getAllSP();
    }

    // Read tour by ID
    @GetMapping("/getSPById/{id}")
    public SpecialPackage getSPById(@PathVariable Long id) {
        return specialPackageServiceInter.getSPById(id);
    }

    // Create tour
    @PostMapping("/create")
    public SpecialPackage createSP(@RequestBody SpecialPackage specialPackage) {
        return specialPackageServiceInter.createSP(specialPackage);
    }

    // Update tour
    @PutMapping("/updateSP/{id}")
    public SpecialPackage updateSP(@RequestBody SpecialPackage specialPackage, @PathVariable Long id){
        return specialPackageServiceInter.updateSP(specialPackage,id);
    }
    // Delete tour
    @DeleteMapping("/delete/{id}")
    public void deleteSP(@PathVariable Long id) {
        specialPackageServiceInter.deleteSP(id);
    }
}