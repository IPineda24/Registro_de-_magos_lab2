package org.example.hogwartlabo2.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.hogwartlabo2.domain.entity.Wizard;
import org.example.hogwartlabo2.repository.WizardRepository;
import org.example.hogwartlabo2.service.WizardService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WizardServiceImpl implements WizardService {

    private final WizardRepository wizardRepository;

    @Override
    public void createWizard(Wizard wizard){
        wizardRepository.save(wizard);
    }

    @Override
    public void updateWizard(UUID id, Wizard wizard) {
        Wizard existWizard = wizardRepository.getWizardById(id);
        existWizard.setName(wizard.getName());
        existWizard.setHouse(wizard.getHouse());
        existWizard.setPatronus(wizard.getPatronus());
        existWizard.setDeathEater(wizard.getDeathEater());
        wizardRepository.save(existWizard);

    }

    @Override
    public List<Wizard> getAllWizard() {
        return wizardRepository.findAll();
    }

    @Override
    public List<Wizard> getWizardDeatheater() {
        return wizardRepository.findByDeathEaterTrue();
    }

    @Override
    public List<Wizard> getPatronus(String patronus) {
        return wizardRepository.findByPatronus(patronus);
    }
    @Override
    public Wizard deleteWizard(UUID id) {
        Wizard existWizard = wizardRepository.getWizardById(id);
        wizardRepository.deleteById(id);
        return existWizard;
    }

}
