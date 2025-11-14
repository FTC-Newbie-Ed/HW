class HW3 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Dog bozo = new Dog("poo", 9, true);
        System.out.println(bozo.getAge());
        System.out.println(bozo.dogYears(bozo.getAge()));
        bozo.setAge(10);
        System.out.println(bozo.dogYears(bozo.getAge()));
    }
}

class Dog {
    private String breed;
    private int age;
    private boolean knowsTricks;
    
    public Dog(String mybreed, int myage, boolean myknowsTricks) {
        breed = mybreed;
        age = myage;
        knowsTricks = myknowsTricks;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String newBreed) {
        breed = newBreed;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int newAge) {
        age = newAge;
    }
    
    public int dogYears(int age) {
        return age * 7;
    }
}
