package com.platzi.platzimarket.persistence.mapper;

import com.platzi.platzimarket.domain.service.PurchaseItem;
import com.platzi.platzimarket.persistence.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PurchaseItemMapper {

    //los mappins no son necesarios en java
    @Mappings({
            @Mapping(source = "id.idProducto", target = "productId"),
            @Mapping(source = "cantidad",target = "quantity"),
            @Mapping(source = "estado",target = "active"),
    })

    PurchaseItem toPurchaseItem(ComprasProducto comprasProducto);
    List<PurchaseItem>toPurchasesItems(List<ComprasProducto>comprasProductos);

    @InheritInverseConfiguration
    @Mapping(target = "compra", ignore = true)
    @Mapping(target = "producto", ignore = true)
    @Mapping(target = "id.idCompra", ignore = true)
    ComprasProducto toComprasProducto (PurchaseItem purchaseItem);
}
