package co.com.sofka.pet_project.jefe;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.pet_project.jefe.events.*;
import co.com.sofka.pet_project.jefe.value.*;
import co.com.sofka.pet_project.persona.value.PersonaId;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Jefe extends AggregateEvent<JefeId> {

    protected Nombre nombre;
    protected Email email;
    protected Cargo cargo;

    protected Set<Funcion> funciones;
    protected Set<Regitro> registros;

    protected PersonaId personaId;

    public Jefe(JefeId entityId, Nombre nombre, Email email, Cargo cargo) {
        super(entityId);
        appendChange(new JefeCreado(nombre, email, cargo)).apply();
    }

    private Jefe(JefeId jefeId){
        super(jefeId);
        subscribe(new JefeChange(this));

    }

    public void agregarFuncion(FuncionId entityId, Caracteristica caracteristica, Descripcion descripcion) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(caracteristica);
        Objects.requireNonNull(descripcion);
        appendChange(new FuncionAgregada(entityId, caracteristica, descripcion)).apply();
    }

    public void asociarPersona(PersonaId personaId) {
        appendChange(new PersonaAsociada(personaId)).apply();
    }

    public void cambiarNombre(Nombre nombre) {
        appendChange(new NombreCambiado(nombre)).apply();
    }

    public void actualizarCaracteristicaDeUnaFuncion(FuncionId entityId, Caracteristica caracteristica) {
        appendChange(new CaracteristicaDeFuncionActualizada(entityId, caracteristica)).apply();
    }

    public void actualizarDescripcionDeUnaFuncion(FuncionId entityId, Descripcion descripcion) {
        appendChange(new DescripcionDeFuncionActualizada(entityId, descripcion)).apply();
    }

    public Optional<Funcion> getFuncionPorId(FuncionId entityId){
        return funciones()
                .stream()
                .filter(funcion -> funcion.identity().equals(entityId))
                .findFirst();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Email email() {
        return email;
    }

    public Cargo cargo() {
        return cargo;
    }

    public Set<Funcion> funciones() {
        return funciones;
    }

    public Set<Regitro> registros() {
        return registros;
    }

    public PersonaId personaId() {
        return personaId;
    }
}
