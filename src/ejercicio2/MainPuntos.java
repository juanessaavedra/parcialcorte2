package ejercicio2;

import ejercicio2.dto.PuntosDTO;
import ejercicio2.interfaces.IPuntos;
import ejercicio2.service.PuntosServiceImpl;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainPuntos  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc = "1";
        IPuntos repo = new PuntosServiceImpl();

        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Menu \n 1. Add \n 2. List \n 3. Update \n 4. Delete \n 5. Exit");

            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Id Points");
                    Integer id = s.nextInt();
                    System.out.println("Client name");
                    String nam = s.next();
                    System.out.println("Price");
                    double pri = s.nextDouble();
                    System.out.println("Accumulated points");
                    double poi = s.nextDouble();
                    repo.save(new PuntosDTO(id,nam,pri,poi));
                    break;
                }

                case "2": {
                    List<PuntosDTO> local = repo.findAll();
                    if (!local.isEmpty()) {
                        local.forEach(System.out::println);
                    } else {
                        System.out.println("No points accumulated");
                    }
                    break;

                }
                case "3": {
                    System.out.println("===== Update ====");
                    System.out.print("Id Points: ");
                    Integer id = s.nextInt();
                    System.out.print("Client name: ");
                    String nam = s.next();
                    System.out.print("New Price: ");
                    double pri = s.nextDouble();
                    System.out.print("New Accumulated points ");
                    double poi = s.nextDouble();
                    PuntosDTO beaActualizar = new PuntosDTO(id, nam, pri, poi);
                    repo.update(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== Delete ======");
                    System.out.print("Id Points ");
                    Integer id = s.nextInt();
                    repo.delete(repo.findById(id));
                    repo.findAll().forEach(System.out::println);
                    break;

                }
                case "5": {
                    opc = "5";
                    break;
                }
            }
        } while (opc != "5");
    }
}



