package ejercicio2.interfaces;

import ejercicio2.dto.PuntosDTO;

import java.io.IOException;
import java.util.List;

public interface IPuntos {
    PuntosDTO findById (int id);

    List<PuntosDTO> findAll() throws IOException, ClassNotFoundException;

    void save(PuntosDTO point) throws IOException;

    void update (PuntosDTO point) throws IOException;

    void delete (PuntosDTO point) throws IOException;
}
