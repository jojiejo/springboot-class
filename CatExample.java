class Cat {
    private String fur_color;
    private int num_of_leg;

    public Cat(String fur_color, int num_of_leg){
        this.fur_color = fur_color;
        this.num_of_leg = num_of_leg;
    }

    public void setFurColor(String fur_color){
        this.fur_color = fur_color;
    }

    public void setNumOfLeg(int num_of_leg){
        this.num_of_leg = num_of_leg;
    }

    public String getFurColor(){
        return this.fur_color;
    }

    public int getNumOfLeg(){
        return this.num_of_leg;
    }

    public void showIdentity(){
        System.out.println("Saya kucing dengan detail, warna bulu: " + fur_color + " dengan jumlah kaki " + num_of_leg);
    }
}

public class CatExample {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Hitam", 4);
        firstCat.showIdentity();
        Cat secondCat = new Cat("Putih", 3);
        secondCat.showIdentity();
        Cat thirdCat = new Cat("Hitam Putih", 4);
        thirdCat.showIdentity();
        Cat fourthCat = new Cat("Poleng Poleng", 3);
        fourthCat.showIdentity();
        Cat fifthCat = new Cat("Bintik Bintik", 4);
        fifthCat.showIdentity();
    }
}
