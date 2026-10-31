package kelvyn.dev.javaandchill.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import kelvyn.dev.javaandchill.database.model.Order;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface  OrderMapper {

    void updateOrderMapper(Order orderSource, @MappingTarget Order orderTarget);

}
