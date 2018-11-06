package com.hmtri.graphqltest.scalar;

import graphql.language.ScalarTypeDefinition;
import graphql.schema.Coercing;
import graphql.schema.CoercingSerializeException;
import graphql.schema.GraphQLScalarType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MapScalarType extends GraphQLScalarType {
    private static final Logger LOGGER = LoggerFactory.getLogger(MapScalarType.class);
    MapScalarType() {
        super("Map", "Map type", new Coercing() {
            @Override
            public Object serialize(Object o) {
                Map map = null;
                try {
                    map = Map.class.cast(o);
                } catch (ClassCastException exception) {
                    throw new CoercingSerializeException("Could not convert " + o + " into a Map", exception);
                }
                return map;
            }

            @Override
            public Object parseValue(Object o) {
                LOGGER.warn("parseValue called");
                return null;
            }

            @Override
            public Object parseLiteral(Object o) {
                LOGGER.warn("parseLiteral called");
                return null;
            }
        });
    }
}
