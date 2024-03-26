//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

        }
        var dog =8.0;
        System.out.println(dog);
        dog = dog +4;
        System.out.println(dog);
        var cat =3.6;
        System.out.println(cat);
        cat = cat +4;
        System.out.println(cat);
        var paper =763789;
        System.out.println(paper);
        paper = paper +4;
        System.out.println(paper);
       dog = dog -3.5;
        System.out.println(dog);
        cat = cat -1.6;
        System.out.println(cat);
        paper = paper -7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend /7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
        var liftingCapacity = 78.2;
        var stuffWeight = 82.7;
        var capacityLeft = liftingCapacity + stuffWeight;
        System.out.println(" общая масса двух бойцов " + capacityLeft + " кг! ");
        var differenceWeight = stuffWeight - liftingCapacity;
        System.out.println("разницу между массами бойцов составляет " + differenceWeight + "кг! ");
        var overload = stuffWeight % liftingCapacity;
        System.out.println("остаток от деления между двумя весами равен " + overload);
        var workerWeight = 8;
        var watchWeight = 640;
        var totalWeight = watchWeight / workerWeight;
        System.out.println("Всего работников в компании " + totalWeight + " Человек!");
        totalWeight = totalWeight +94;
        System.out.println(totalWeight);
        var watcherWeight = totalWeight * workerWeight;
        System.out.println("Если в компании работает "+ totalWeight + " Человек" + " То всего " + watcherWeight + " часов");






    }
}