package com.platzi.platzimarket.persistence.mapper;

import com.platzi.platzimarket.domain.service.Purchase;
import com.platzi.platzimarket.persistence.entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

public interface PurchaseMapper {
    @Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
    public interface CategoryMapper {
        @Mappings({
                @Mapping(source="idCompra",target="purchaseId"),
                @Mapping(source="idCliente",target="clientId"),
                @Mapping(source="fecha",target="dates"),
                @Mapping(source="medioPago",target="paymentMethod"),
                @Mapping(source="comentario",target="comment"),
                @Mapping(source="estado",target="state"),
                @Mapping(source="productos",target="items"),
        })
        Purchase toPurchase(Compra compras);
        List<Purchase>toPurchases(List<Compra>compras);

        @InheritInverseConfiguration
        @Mapping(target ="cliente", ignore = true)
        Compra toCompras(Purchase purchase);
    }
}
