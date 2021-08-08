package module;

public class Hero {
    private int id;
    private String name;
    private int age;
    private String specialPowers;
    private  String weakness;

    public Hero(String name,int age,String specialPowers,String weakness){
        this.name=name;
        this.age=age;
        this.specialPowers=specialPowers;
        this.weakness=weakness;

    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void age(int age){
        this.age=age;
    }
    public void setSpecialPowers(String specialPowers){
        this.specialPowers=specialPowers;
    }
    public  void setWeakness(String weakness){
        this.weakness=weakness;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSpecialPowers(){
        return specialPowers;
    }
    public String getWeakness(){
        return weakness;
    }

}
