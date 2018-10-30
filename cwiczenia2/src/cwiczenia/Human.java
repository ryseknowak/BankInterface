package cwiczenia;

public class Human {
    private int age;
    private double weight;
    private double height;
    private String name;
    private HumanSex sex;
    private EyeColour eColour;
    private HairColour hColour;


    public Human() {
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.name = "unknown";
        this.sex = HumanSex.Male;
        this.eColour = EyeColour.brown;
        this.hColour = HairColour.black;
    }

    public Human(int age, double weight, double height, String name, HumanSex sex, EyeColour eColour, HairColour hColour) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.sex = sex;
        this.eColour = eColour;
        this.hColour = hColour;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HumanSex getSex() {
        return this.sex;
    }

    public void setSex(HumanSex sex) {
        this.sex = sex;
    }

    public EyeColour getEyeColour() {
        return this.eColour;
    }

    public void setEyeColour(EyeColour eColour) {
        this.eColour = eColour;
    }

    public HairColour getHairColour() {
        return this.hColour;
    }

    public void setHairColour(HairColour hColour) {
        this.hColour = hColour;
    }
}
