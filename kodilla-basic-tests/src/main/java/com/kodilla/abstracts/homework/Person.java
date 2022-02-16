package com.kodilla.abstracts.homework;

public class Person {
    public String firstName;
    public int age;
    public Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
        public void showResponsibilities() {
        System.out.println(job.getResponsibilities());
    }
    public void showSalary() {
        System.out.println(job.getSalary());
    }

    public static void main(String[] args) {

        Job teacher = new Teacher(2000, "teaching kids, inserts grades");
        Person person = new Person("Mateusz", 29, teacher);
        person.showResponsibilities();
        person.showSalary();

        Job seller = new Seller(5000, "sales goods, meeting with clients");
        Person person2 = new Person("Piotr", 31, seller);
        person2.showResponsibilities();
        person2.showSalary();

        Job busDriver = new BusDriver(3500, "driving a bus, drive people");
        Person person3 = new Person("Jan",32, busDriver);
        person3.showResponsibilities();
        person3.showSalary();
    }
}
