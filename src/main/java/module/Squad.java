package module;

public class Squad {
    private int id;
    private int maxSize;
    private String name;
    private String fightingCause;

    public Squad(int maxSize,String name,String fightingCause){
        this.maxSize=maxSize;
        this.name=name;
        this.fightingCause=fightingCause;

    }
    //set methods
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMaxSize(int maxSize){
        this.maxSize=maxSize;
    }
    public void setFightingCause(String fightingCause){
        this.fightingCause=fightingCause;
    }

    //get methods
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getMaxSize() { return maxSize;}
    public String getFightingCause(){ return fightingCause;}


}
