class Fish {
    private String type;
    private String feed;

    public Fish(String type, String feed){
        this.type = type;
        this.feed = feed;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setFeed(String feed){
        this.feed = feed;
    }

    public String getType(){
        return this.type;
    }

    public String getFeed(){
        return this.feed;
    }

    public void showIdentity(){
        System.out.println("Saya ikan dengan detail, jenis: " + type + ", makanan: " + feed);
    }
}

public class FishExample {
    public static void main(String[] args) {
        Fish firstFish = new Fish("Paus", "Plankton");
        firstFish.showIdentity();

        Fish secondFish = new Fish("Cupang", "Cacing");
        secondFish.showIdentity();

        Fish thirdFish = new Fish("Arwana", "Jangkrik");
        thirdFish.showIdentity();

        Fish fourthFish = new Fish("Sapu-sapu", "Pelet");
        fourthFish.showIdentity();
    }
}
