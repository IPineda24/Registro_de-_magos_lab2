package org.example.hogwartlabo2.service;

import org.example.hogwartlabo2.domain.entity.Wizard;

import java.util.UUID;

public interface WizardService  {
    void createWizard(Wizard wizard);
    void updateWizard(UUID id, Wizard wizard);
    Wizard getAllWizard();
    Wizard getWizardDeatheater(Boolean isDeatheater);
    Wizard getPatronus(String patronus);
    Wizard deleteWizard(UUID id);
}
