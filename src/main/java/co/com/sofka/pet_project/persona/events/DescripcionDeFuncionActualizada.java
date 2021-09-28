package co.com.sofka.pet_project.persona.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.persona.value.DescripcionFuncion;
import co.com.sofka.pet_project.persona.value.FuncionId;

public class DescripcionDeFuncionActualizada extends DomainEvent {

    private final FuncionId funcionId;
    private final DescripcionFuncion descripcionFuncion;

    public DescripcionDeFuncionActualizada(FuncionId entityId, DescripcionFuncion descripcionFuncion) {
        super("sofka.persona.descripciondefuncionactualizada");
        this.funcionId = entityId;
        this.descripcionFuncion = descripcionFuncion;
    }

    public FuncionId getFuncionId() {
        return funcionId;
    }

    public DescripcionFuncion getDescripcionFuncion() {
        return descripcionFuncion;
    }
}
