class Animal {
    protected String name;
    protected String food;
    protected boolean hasSharpTeeth;

    public Animal(String name){
        this.name = name;
    }

    public Animal(String name, String food, boolean hasSharpTeeth){
        this.name = name;
        this.food = food;
        this.hasSharpTeeth = hasSharpTeeth;
    }

    public void identifyMyself(){
        System.out.println("Hi I'm parent of all animals, my name is " + name);
    }

    public String parseHasSharpTeeth(){
        String teeth = hasSharpTeeth? "sharp teeth" : "blunt teeth";
        return teeth;
    }
}

class Herbivor extends Animal {
    public Herbivor(String name, String food, boolean hasSharpTeeth){
        super(name, food, hasSharpTeeth);
    }

    public static Herbivor construct(String name, String food, boolean hasSharpTeeth) {
        if (hasSharpTeeth) return null;
        else if (food != "Plant") return null;
        else return new Herbivor(name, food, hasSharpTeeth);
    }

    public void identifyMyself(){
        System.out.println("Hi I'm Herbivor, my name is " + name + 
        ", my food is " + food + 
        ", i have " + parseHasSharpTeeth());
    }
}

class Carnivor extends Animal {
    public Carnivor(String name, String food, boolean hasSharpTeeth){
        super(name, food, hasSharpTeeth);
    }

    public static Carnivor construct(String name, String food, boolean hasSharpTeeth) {
        if (!hasSharpTeeth) return null;
        else if (food != "Meat") return null;
        else return new Carnivor(name, food, hasSharpTeeth);
    }

    public void identifyMyself(){
        System.out.println("Hi I'm Carnivor, my name is " + name + 
        ", my food is " + food + 
        ", i have " + parseHasSharpTeeth());
    }
}

class Omnivor extends Animal {
    public Omnivor(String name, String food, boolean hasSharpTeeth){
        super(name, food, hasSharpTeeth);
    }

    public void identifyMyself(){
        System.out.println("Hi I'm Omnivor, my name is " + name + 
        ", my food is " + food + 
        ", i have " + parseHasSharpTeeth());
    }
}

public class AnimalExample {
    public static void main(String[] args) {
        Animal objAnimal = new Animal("Binatang");
        objAnimal.identifyMyself();

        System.out.println();
        Herbivor objGoat = Herbivor.construct("Goat", "Plant", false);
        if(objGoat != null) objGoat.identifyMyself();
        
        Carnivor objLion = Carnivor.construct("Lion", "Meat", true);
        if(objLion != null) objLion.identifyMyself();

        System.out.println();
        Omnivor objChicken = new Omnivor("Chicken", "Everything", false);
        objChicken.identifyMyself();
    }
}
