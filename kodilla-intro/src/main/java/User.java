public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }
    String getName() {
        return this.name;
    }
    int getAge() {
        return this.age;
    }
    public static void main(String[] args) {
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);
        User[] users = {anna, betty, carl, david, eva, frankie};

        double result = 0;
        for (int i = 0; i < users.length; i ++) {
            result = result + users[i].getAge();
        }
        double average = result / users.length;
        System.out.println(average);

        for (int i = 0; i < users.length; i ++) {
        if (users[i].getAge() < average) {
        System.out.println(users[i].getAge());
            }
        }

    }
}
