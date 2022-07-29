package com.ap.ap.services;

import com.ap.ap.models.Skills;
import com.ap.ap.repository.SkillsRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsService {

    private final SkillsRepo skillsRepo;

    @Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }

    public Skills addSkills(Skills skill) {
        return skillsRepo.save(skill);
    }

    public List<Skills> buscarSkills() {
        return skillsRepo.findAll();
    }

    public Skills editarEducacion(Skills skill) {
        return skillsRepo.save(skill);
    }

    public void borrarEducacion(Long id) {
        skillsRepo.deleteById(id);
    }

}
