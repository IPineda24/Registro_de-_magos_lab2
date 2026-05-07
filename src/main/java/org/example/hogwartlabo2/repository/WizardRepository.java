package org.example.hogwartlabo2.repository;

import org.example.hogwartlabo2.domain.entity.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WizardRepository extends JpaRepository<Wizard, UUID> {

}
