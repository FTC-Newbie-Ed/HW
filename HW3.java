class HelloWorld {
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
    //CODE GOES HERE
}
