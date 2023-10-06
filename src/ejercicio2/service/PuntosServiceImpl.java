package ejercicio2.service;

import ejercicio2.dto.PuntosDTO;
import ejercicio2.interfaces.IPuntos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PuntosServiceImpl implements IPuntos {

    public List<PuntosDTO> points;

    public PuntosServiceImpl() throws IOException, ClassNotFoundException {
        points = new ArrayList<>();
    }


    @Override
    public PuntosDTO findById(int id) {
        return points.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<PuntosDTO> findAll() throws IOException, ClassNotFoundException {
        points = (List<PuntosDTO>) ObjectSerializer.readObjetFromFile("Points.ax");
        return points;
    }

    @Override
    public void save(PuntosDTO point) throws IOException {
        points.add(point);
        ObjectSerializer.writeObjectToFile(points, "Points.ax");
    }

    @Override
    public void update(PuntosDTO point) throws IOException {
        PuntosDTO oldPoint = findById(point.getId());
        if (oldPoint != null) {
            points.remove(oldPoint);
            points.add(point);
            ObjectSerializer.writeObjectToFile(points, "Points.ax");
        }
    }

    @Override
    public void delete(PuntosDTO point) throws IOException {
        points.remove(point);
        ObjectSerializer.writeObjectToFile(points, "Points.ax");
    }
}
