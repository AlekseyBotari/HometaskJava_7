public class DatingSite {
    String name;
    short age;
    int growth;

    public DatingSite (String name, short age, int growth){
        this.name = name;
        this.age = age;
        this.growth = growth;
    }

    public DatingSite (short age, String name, int growth){
        this.name = name;
        this.age = age;
        this.growth = growth;
    }

    public DatingSite (int growth, short age, String name){
        this.name = name;
        this.age = age;
        this.growth = growth;
    }

    public DatingSite (short age, int growth, String name){
        this.name = name;
        this.age = age;
        this.growth = growth;
    }

    public DatingSite (String name,  int growth, short age){
        this.name = name;
        this.age = age;
        this.growth = growth;
    }
    public DatingSite (int growth,  String name, short age){
        this.name = name;
        this.age = age;
        this.growth = growth;
    }
}
