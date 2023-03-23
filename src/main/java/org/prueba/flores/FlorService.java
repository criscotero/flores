package org.prueba.flores;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FlorService {

    private final FlorRepository florRepository;

    public void agregarFlor(AgregarFlorRequest request) {

        Flor flor = Flor.builder()
                .id(request.id())
                .name(request.name())
                .price(request.price())
                .build();


        florRepository.saveAndFlush(flor);

    }

    public List<Flor> findAllFlores() {
        return florRepository.findAll();
    }

    public List<Flor> findAllFloresByName(String nombre) {
        return florRepository.findAllByName(nombre);
    }




}
