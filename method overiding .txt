class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // Output: Animal makes a sound
        
        Cat cat = new Cat();
        cat.sound(); // Output: Cat meows
    }
}
