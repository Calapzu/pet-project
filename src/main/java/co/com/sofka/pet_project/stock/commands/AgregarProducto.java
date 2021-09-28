package co.com.sofka.pet_project.stock.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.pet_project.stock.value.CantidadProducto;
import co.com.sofka.pet_project.stock.value.NombreProducto;
import co.com.sofka.pet_project.stock.value.ProductoId;

public class AgregarProducto extends Command {

    private final ProductoId entityId;
    private final NombreProducto nombreProducto;
    private final CantidadProducto cantidadProducto;

    public AgregarProducto(ProductoId entityId, NombreProducto nombreProducto, CantidadProducto cantidadProducto) {
        this.entityId = entityId;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public ProductoId getEntityId() {
        return entityId;
    }

    public NombreProducto getNombreProducto() {
        return nombreProducto;
    }

    public CantidadProducto getCantidadProducto() {
        return cantidadProducto;
    }
}
