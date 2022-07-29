package com.ap.ap.controller;

import com.ap.ap.models.Skills;
import com.ap.ap.services.SkillsService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skills")
@CrossOrigin(origins = "http://localhost:4200")
public class SkillsController {
    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Skills>> obtenerSkills(){
        List<Skills> skills = skillsService.buscarSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Skills> editarSkill(@RequestBody Skills skil){
        Skills updateSkill = skillsService.editarSkills(skil);
        return new ResponseEntity<>(updateSkill, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Skills> crearSkills(@RequestBody Skills skill){
        Skills nuevoSkill = skillsService.addSkills(skill);
        return new ResponseEntity<>(nuevoSkill, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarSkills(@PathVariable("id") Long id){
        skillsService.borrarSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
