package co.com.sofka.pet_project.stock;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.pet_project.stock.value.CantidadProducto;
import co.com.sofka.pet_project.stock.value.NombreProducto;
import co.com.sofka.pet_project.stock.value.ProductoId;

import java.util.Objects;

public class Producto extends Entity<ProductoId> {

    private NombreProducto nombreProducto;
    private CantidadProducto cantidadProducto;

    public Producto(ProductoId entityId, NombreProducto nombreProducto, CantidadProducto cantidadProducto) {
        super(entityId);
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
    }

    //Luego de haber instaciado las clases de objeto de valor de NombreProducto y CantidadProducto, y de haberlas colocado en el
    //constructor y colocado los getter de cada uno, luego se crean los comportamientos de la entidad

    public void agregarProducto(NombreProducto nombreProducto, CantidadProducto cantidadProducto){
        //Se valida para que ni el nombre del producto vaya a ser nulo
        this.nombreProducto = Objects.requireNonNull(nombreProducto);
        this.cantidadProducto = Objects.requireNonNull(cantidadProducto);
    }

    public void sacarProducto(NombreProducto nombreProducto, CantidadProducto cantidadProducto){
        //Se valida para que ni el nombre del producto vaya a ser nulo
        this.nombreProducto = Objects.requireNonNull(nombreProducto);
        this.cantidadProducto = Objects.requireNonNull(cantidadProducto);
    }

    public NombreProducto nombreProducto() {
        return nombreProducto;
    }

    public CantidadProducto cantidadProducto() {
        return cantidadProducto;
    }
}
