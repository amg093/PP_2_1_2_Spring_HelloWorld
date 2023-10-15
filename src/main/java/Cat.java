public class Cat {
    private String name;

    public Cat() { // dedault constructor

    }

    public Cat(String name) { // plain constructor
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
