class Car {
    private String type;
    private String color;
    private int num_of_tire;

    public Car(String type, String color, int num_of_tire){
        this.type = type;
        this.color = color;
        this.num_of_tire = num_of_tire;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setNumOfPetal(int num_of_tire){
        this.num_of_tire = num_of_tire;
    }

    public String getType(){
        return this.type;
    }

    public String getColor(){
        return this.color;
    }

    public int getNumOfTire(){
        return this.num_of_tire;
    }

    public void showIdentity(){
        System.out.println("Saya bunga dengan detail, tipe: " + type + ", warna: " + color + ", jumlah roda: " + num_of_tire);
    }
}

public class CarExample {
    public static void main(String[] args) {
        Car firstCar = new Car("Sedan", "Merah", 4);
        firstCar.showIdentity();

        Car secondCar = new Car("Truk", "Hijau", 6);
        secondCar.showIdentity();

        Car thirdCar = new Car("Tronton", "Coklat", 12);
        thirdCar.showIdentity();

        Car fourthCar = new Car("Angkot", "Kuning", 4);
        fourthCar.showIdentity();
    }
}
