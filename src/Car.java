public class Car implements Comparable<Car> {
    double engineVolume;
    String carBrand;
    String carModel;

    public Car(double engineVolume, String carBrand, String carModel) {
        this.engineVolume = engineVolume;
        this.carBrand = carBrand;
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Car {");
        stringBuilder.append("engineVolume = ").append(engineVolume)
                .append(", carBrand = ").append(carBrand)
                .append(", carModel = ").append(carModel)
                .append("}");
        return stringBuilder.toString();
    }

    @Override
    public int compareTo(Car anotherCar) {
        if (this.engineVolume == anotherCar.engineVolume) {
            return 0;
        } else if (this.engineVolume < anotherCar.engineVolume) {
            return -1;
        } else {
            return 1;
        }
    }
}
