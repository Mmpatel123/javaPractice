package Class9HwPT1;

public class Animal {
    public Animal() {
        System.out.println("A new animal has been created!");
    }

    public void sleep() {
        System.out.println("An animal sleeps...");
    }

    public void eat() {
        System.out.println("An animal eats...");
    }
}
 class Bird extends Animal {
    public Bird() {
        super();
        System.out.println("A new bird has been created!");
    }


    public void sleep() {
        System.out.println("A bird sleeps...");
    }

      public void eat() {
        System.out.println("A bird eats...");
    }
}

class Dog extends   Animal {
    public Dog() {
        super();
        System.out.println("A new dog has been created!");
    }


    public void sleep() {
        System.out.println("A dog sleeps...");
    }


    public void eat() {
        System.out.println("A dog eats...");
    }

    public void meat()
    {
        System.out.println("A dog eats meat...");
    }
}

 class Mainclass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sleep();
        animal.eat();

        Bird bird=new Bird();
        bird.sleep();
        bird.eat();

        Dog dog=new Dog();
        dog.sleep();
        dog.eat();


        dog.meat();


    }
}