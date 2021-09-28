package co.com.sofka.pet_project.persona.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.persona.value.DescripcionInforme;
import co.com.sofka.pet_project.persona.value.InformeId;

public class InformeMostrado extends DomainEvent {

    private final InformeId entityId;
    private final DescripcionInforme descripcionInforme;

    public InformeMostrado(InformeId entityId, DescripcionInforme descripcionInforme) {
        super("sofka.persona.caracteristicadefuncionactualizada");
        this.entityId = entityId;
        this.descripcionInforme = descripcionInforme;
    }

    public InformeId getInformeId() {
        return entityId;
    }

    public DescripcionInforme getDescripcionInforme() {
        return descripcionInforme;
    }
}
