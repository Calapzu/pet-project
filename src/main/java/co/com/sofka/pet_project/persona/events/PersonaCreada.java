package co.com.sofka.pet_project.persona.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.persona.value.Email;
import co.com.sofka.pet_project.persona.value.Nombre;

public class PersonaCreada extends DomainEvent {

    private final Nombre nombre;
    private final Email email;

    public PersonaCreada(Nombre nombre, Email email) {
        super("sofka.persona.personacreada");
        this.nombre = nombre;
        this.email = email;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
