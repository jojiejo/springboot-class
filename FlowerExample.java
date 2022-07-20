class Flower {
    private String name;
    private String color;
    private int num_of_petal;

    public Flower(String name, String color, int num_of_petal){
        this.name = name;
        this.color = color;
        this.num_of_petal = num_of_petal;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setNumOfPetal(int num_of_petal){
        this.num_of_petal = num_of_petal;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public int getNumOfPetal(){
        return this.num_of_petal;
    }

    public void showIdentity(){
        System.out.println("Saya bunga dengan detail, jenis: " + name + ", warna: " + color + ", jumlah kelopak: " + num_of_petal);
    }
}

public class FlowerExample {
    public static void main(String[] args) {
        Flower firstFlower = new Flower("Bangkai", "Merah", 12);
        firstFlower.showIdentity();

        Flower secondFlower = new Flower("Anggrek", "Putih", 8);
        secondFlower.showIdentity();
        
        Flower thirdFlower = new Flower("Mawar", "Merah", 3);
        thirdFlower.showIdentity();

        Flower fourthFlower = new Flower("Melati", "Kuning", 5);
        fourthFlower.showIdentity();
    }
}
