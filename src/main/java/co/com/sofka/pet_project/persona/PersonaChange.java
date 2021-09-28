package co.com.sofka.pet_project.persona;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.pet_project.persona.events.*;
import co.com.sofka.pet_project.persona.value.DescripcionInforme;

import java.util.HashSet;

public class PersonaChange extends EventChange {
    public PersonaChange(Persona persona) {
        apply((PersonaCreada event) -> {
            persona.nombre = event.getNombre();
            persona.funciones = new HashSet<>();
            persona.informes = new HashSet<>();
        });

        apply((StockAsociado event) -> {
            persona.stockId = event.getStockId();
        });

        apply((DescripcionDeFuncionActualizada event) -> {
            var funcion = persona.getFuncionPorId(event.getFuncionId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la funcion de la persona"));
            funcion.actualizaDescripcion(event.getDescripcionFuncion());
        });

        apply((DescripcionInformeActualizada event) ->{
            var descripcion = persona.getInformePorId(event.getInformeId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el informe"));
            descripcion.actualizaDescripcionInforme(event.getDescripcionInforme());
        });

        apply((FuncionAgregada event) -> {
            var numFuncioanes = persona.funciones.size();
            if (numFuncioanes == 6) {
                throw new IllegalArgumentException("No puedes agregar mas funcionesn solo puedes tener hasta 5 funciones");
            }
            persona.funciones.add(new Funcion(
                    event.getFuncionId(),
                    event.getCaracteristica(),
                    event.getDescripcion()
            ));
        });

        apply((InformeMostrado event) -> {
            var descripcion = persona.getInformePorId(event.getInformeId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el informe"));
            persona.mostrarDescricionInforme(event.getInformeId(), event.getDescripcionInforme());
        });




    }
}
