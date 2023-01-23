//https://youtu.be/GIIPo509Vpk?t=1410
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Liskov substitution principle
// Принцип подстановки Лисков
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель
public class Ex003_1LSP {
    public static void main(String[] args) throws Exception {
        List<Animal> list = 
        new ArrayList<>(Arrays.asList(new Cat(), new Fish() )); // закидываем котика и рыбку в лист
        for (var animal : list) { // хотим пробежатся по типу и по количеству лап
            System.out.println(animal.getType());
            System.out.println(animal.getLegsCount());
        }
    }
}

abstract class Animal {
    public String getType() {
        return "Зверушка";
    } // какое то животное

    public int getLegsCount() throws Exception { // количество лап
        return 0;
    }
}

class Cat extends Animal { //простраиваем иерархию

    @Override
    public String getType() {
        return "кошечка";
    }

    @Override
    public int getLegsCount() {
        return 4;
    }
}

class Fish extends Animal
{
     @Override
     public String getType() {
        return "Рыбка";
     } // а если у рыбки нет лапок?
     public int getLegsCount() throws Exception {
        throw new Exception("я же рыбка...");
     }
}