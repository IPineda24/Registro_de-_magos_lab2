package org.example.hogwartlabo2.repository;

import org.example.hogwartlabo2.domain.entity.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface WizardRepository extends JpaRepository<Wizard, UUID> {

    List<Wizard> findByIsDeathEaterTrue();
    Optional<Wizard> findByPatronus(String patronus);
    Wizard getWizardById(UUID id);
}
