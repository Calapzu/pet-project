package co.com.sofka.pet_project.persona;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.persona.events.*;
import co.com.sofka.pet_project.persona.value.*;
import co.com.sofka.pet_project.stock.value.StockId;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Persona extends AggregateEvent<PersonaId> {

    protected Nombre nombre;
    protected Set<Funcion> funciones;
    protected Set<Informe> informes;
    protected StockId stockId;

    public Persona(PersonaId entityId, Nombre nombre, Email email) {
        super(entityId);
        appendChange(new PersonaCreada(nombre, email)).apply();
    }

    private Persona(PersonaId entityId){
        super(entityId);
        subscribe(new PersonaChange(this));
    }

    public static Persona from(PersonaId personaId, List<DomainEvent> events){
        var persona = new Persona(personaId);
        events.forEach(persona::applyEvent);
        return persona;
    }

    public void agregarFuncion(FuncionId entityId, CaracteristicaFuncion caracteristica, DescripcionFuncion descripcion) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(caracteristica);
        Objects.requireNonNull(descripcion);
        appendChange(new FuncionAgregada(entityId, caracteristica, descripcion)).apply();
    }
    public void asociarStock(StockId stockId) {
        appendChange(new StockAsociado(stockId)).apply();
    }

    public void actualizarDescripcionDeUnaFuncion(FuncionId entityId, DescripcionFuncion descripcion) {
        appendChange(new DescripcionDeFuncionActualizada(entityId, descripcion)).apply();
    }

    public void actualizarDescripcionInforme(InformeId entityId, DescripcionInforme descripcion) {
        appendChange(new DescripcionInformeActualizada(entityId, descripcion)).apply();
    }

    public void mostrarDescricionInforme(InformeId entityId, DescripcionInforme descripcionInforme){
        appendChange(new InformeMostrado(entityId, descripcionInforme)).apply();
    }

    public Optional<Funcion> getFuncionPorId(FuncionId entityId){
        return funciones()
                .stream()
                .filter(funcion -> funcion.identity().equals(entityId))
                .findFirst();
    }

    public Optional<Informe> getInformePorId(InformeId entityId){
        return informes()
                .stream()
                .filter(informe -> informe.identity().equals(entityId))
                .findFirst();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Set<Funcion> funciones() {
        return funciones;
    }

    public Set<Informe> informes() {
        return informes;
    }

    public StockId stockId() {
        return stockId;
    }
}
