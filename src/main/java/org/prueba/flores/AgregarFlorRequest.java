package org.prueba.flores;

import lombok.ToString;


public record AgregarFlorRequest(
        Integer id,
        String name,
        Double price
) {

}
