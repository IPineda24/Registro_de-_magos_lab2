package org.example.hogwartlabo2.service;

import org.example.hogwartlabo2.domain.entity.Wizard;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface WizardService  {
    void createWizard(Wizard wizard);
    void updateWizard(UUID id, Wizard wizard);
    List<Wizard>  getAllWizard();
    List<Wizard> getWizardDeatheater();
    Optional<Wizard> getPatronus(String patronus);
    Wizard deleteWizard(UUID id);
}
