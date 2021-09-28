package co.com.sofka.pet_project.jefe.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.persona.value.PersonaId;

public class PersonaAsociada extends DomainEvent {

    private final PersonaId personaId;

    public PersonaAsociada(PersonaId personaId) {
        super("sofka.jefe.personaasociada");
        this.personaId = personaId;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }
}
