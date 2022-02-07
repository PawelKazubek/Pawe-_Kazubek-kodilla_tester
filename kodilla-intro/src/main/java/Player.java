public class Player {
    String name;
    double age;
    double height;

    public Player (String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public boolean verifyName (){
        return name != null;
    }
    public boolean verifyAgeAndHeight (){
        return age > 30 && height > 160;
    }
}
