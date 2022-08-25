public class Main {
    public static void main(String[] args) {
        //write your code here

        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println("Всего " + friend + " друзей");
        friend = friend + 2;
        System.out.println("Теперь у меня " + friend + " друга");
        friend = friend / 7;
        System.out.println("Теперь у меня осталось " + friend + " друга");

        var frog = 3.5;
        System.out.println("У меня есть " + frog + " лягушки");
        frog = frog * 10;
        System.out.println("Теперь у меня стало " + frog + " лягушек");
        frog = frog / 3.5;
        System.out.println("У меня осталось " + frog + " лягушек");
        frog = frog + 4;
        System.out.println("Родились " + frog + " лягушки");

        var weightBoxerOne = 78.2;
        var weightBoxerTwo = 82.7;
        var weightBoxerTotal = weightBoxerOne + weightBoxerTwo;
        System.out.println("Общий вес " + weightBoxerTotal + " кг!");
        var weightDiffernce = weightBoxerOne - weightBoxerTwo;
        System.out.println("Разница в весе между первым и вторым боксером " + weightDiffernce + " кг!");
        var overload = (weightBoxerTwo) % weightBoxerOne;
        System.out.println("Второй боксер тяжелее на " + overload + " кг!");

        var hourWorking = 640.00;
        var employeesCompany = hourWorking / 8;
        System.out.println("Всего работников в компании – " + employeesCompany + " человек");
        employeesCompany = employeesCompany + 94;
        var employeesHours = 640.00 / employeesCompany;
        System.out.println("Если в компании работает – " + employeesCompany + " человек, то всего " + employeesHours + " часов работы может быть поделено между сотрудниками.");
    }
}