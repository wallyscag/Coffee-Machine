class Cat {
    static int counter;
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        Cat.counter++;

        if (getNumberOfCats() > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return Cat.counter;
    }
}