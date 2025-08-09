package oop;

public class Tiger extends Animal{
        public Tiger(String name) {
            super(name, true, 10);
        }

        @Override
        public String makeSound() {
            return "Roar!";
        }
}


