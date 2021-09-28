package co.com.sofka.pet_project.jefe;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.pet_project.jefe.events.*;

import java.util.HashSet;

public class JefeChange extends EventChange {
    public JefeChange(Jefe jefe) {
        apply((JefeCreado event) -> {
            jefe.nombre = event.getNombre();
            jefe.cargo = event.getCargo();
            jefe.email = event.getEmail();

            jefe.funciones = new HashSet<>();
            jefe.registros = new HashSet<>();
        });

        apply((PersonaAsociada event) -> {
            jefe.personaId = event.getPersonaId();
        });

        apply((CaracteristicaDeFuncionActualizada event) -> {
            var funcion = jefe.getFuncionPorId(event.getEntityId())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro"));
            funcion.actualizarCaracteristica(event.getCaracteristica());
        });

        apply((DescripcionDeFuncionActualizada event) -> {
            var funcion = jefe.getFuncionPorId(event.getEntityId())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro"));
            funcion.actualizaDescripcion(event.getDescripcion());
        });

        apply((FuncionAgregada event) -> {
           jefe.agregarFuncion(event.getEntityId(), event.getCaracteristica(), event.getDescripcion());
        });

        apply((NombreCambiado event) -> {
            jefe.nombre = event.getNombre();
        });
    }
}
