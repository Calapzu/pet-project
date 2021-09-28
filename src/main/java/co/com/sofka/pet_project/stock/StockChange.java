package co.com.sofka.pet_project.stock;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.pet_project.stock.events.*;

import java.util.HashSet;

public class StockChange extends EventChange {
    public StockChange(Stock stock) {

        apply((StockCreado event) -> {
            stock.nombreStock = event.getNombreStock();
            stock.productos = new HashSet<>();
            stock.materiaPrimas = new HashSet<>();
        });

        apply((MateriaPrimaAgregada event) ->{
            var numMateriaPrima = stock.materiaPrimas.size();
            if (numMateriaPrima == 20){
                throw new IllegalArgumentException("No puede agregar mas Materia Prima solo puedes tener hasta 19 materias primas");
            }
            stock.materiaPrimas.add(new MateriaPrima(
                    event.getEntityId(),
                    event.getNombreMateriaPrima(),
                    event.getCantidadMateriaPrima()
            ));
        });

        apply((ProductoAgregado event) ->{
            var numProducto = stock.productos.size();
            if (numProducto == 20){
                throw new IllegalArgumentException("No se puede agrgar mas Productos solo puedes tener hasta 19 producto");
            }
            stock.productos.add(new Producto(
                    event.getEntityId(),
                    event.getNombreProducto(),
                    event.getCantidadProducto()
            ));
        });

        apply((MateriaPrimaSacada event) ->{
            var materiaPrimaSacada = stock.getMateriaPorId(event.getMateriaPrimaId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encontro la materia prima con ese id"));
            stock.materiaPrimas.remove(materiaPrimaSacada);
        });

        apply((ProductoSacado event) -> {
            var productoASacar = stock.getProductoPorId(event.getProductoId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encontro el producto con ese id"));
            stock.productos.remove(productoASacar);
        });
    }
}
