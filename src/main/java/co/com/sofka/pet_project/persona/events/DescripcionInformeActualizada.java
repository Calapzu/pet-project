package co.com.sofka.pet_project.persona.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.persona.value.DescripcionInforme;
import co.com.sofka.pet_project.persona.value.InformeId;

public class DescripcionInformeActualizada extends DomainEvent {

    private final InformeId informeId;
    private final DescripcionInforme descripcionInforme;

    public DescripcionInformeActualizada(InformeId entityId, DescripcionInforme descripcion) {
        super("sofka.persona.descripciondeinformeactulaizad");
        this.informeId = entityId;
        this.descripcionInforme = descripcion;
    }

    public InformeId getInformeId() {
        return informeId;
    }

    public DescripcionInforme getDescripcionInforme() {
        return descripcionInforme;
    }
}
