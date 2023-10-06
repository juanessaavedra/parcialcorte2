package ejercicio1;

import java.io.Closeable;
import java.io.IOException;

public enum Transporte implements Closeable {

        BUS(100, "Diesel") {
            @Override
            public String showDescription() {
                return "Description: The biggest Tinto Bus";
            }
        },TRAIN(90, "Electric") {
        @Override
        public String showDescription() {
            return "Description: The name of this train is the full train";
        }
    },BOAT (10, "Diesel") {
        @Override
        public String showDescription() {
            return "Description: It is a small boat for special events";
        }
    }, MOTORCYCLE (2, "Hybrid") {
        @Override
        public String showDescription() {
            return "Description: The fastest hybrid motorcycle";
        }
    }, AIRPLANE(200, "Diesel") {
        @Override
        public String showDescription() {
            return "Description: The most expensive airplane";
        }
    };

        private Integer capacity; //id
        private String engineType;


    Transporte(Integer capacity, String engineType) {
        this.capacity = capacity;
        this.engineType = engineType;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public String getEngineType() {
        return engineType;
    }


    public abstract String showDescription();


    @Override
    public void close() throws IOException {

    }

    @Override
    public String toString() {
        return "Transporte{" +
                "capacity=" + capacity +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Transporte transportation1 = Transporte.BUS;
        Transporte transportation2 = Transporte.AIRPLANE;
        Transporte transportation3 = Transporte.MOTORCYCLE;
        Transporte transportation4 = Transporte.BOAT;
        Transporte transportation5 = Transporte.TRAIN;

        System.out.println( " The Bus capacity is  " + transportation1.getCapacity() + " people");
        System.out.println( " The Airplane Engine Type is " + transportation2.getEngineType());
        System.out.println( " The Motorcycle description is " + transportation3.showDescription());
        System.out.println( " The Boat capacity is  " + transportation4.getCapacity() + " people");
        System.out.println( " The Train description is  " + transportation5.showDescription());
    }
}
