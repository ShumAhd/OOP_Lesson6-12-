import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Liskov substitution principle
// Принцип подстановки Лисков
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель

public class Ex003_2LSP {
    public static void main(String[] args) {
        List<AbstractAnimal> list1 = new ArrayList<>(Arrays.asList(new Dog(), new Python()));

        for (var animal : list1) {
            System.out.println(animal.getType());
        }

        List<Legs> list2 = new ArrayList<>(Arrays.asList(new Dog() /*, new Python() */)); //в этом случае коммпелятор не даст вставить питона
        for (var animal : list2) {
            System.out.println(animal.getLegsCount());

        }
    }
}

abstract class AbstractAnimal {
    public String getType() {
        return "Зверушка";
    } //узнаём только тип этого самого животного, потому что животное точно имеет своё наименование
}

interface Legs { //отдельный интерфейс лапки
    int getLegsCount();
}

class Dog extends AbstractAnimal implements Legs { //класс собака наследник зверушек, инплементированы лапки

    @Override
    public String getType() {
        return "собачка";
    }

    @Override
    public int getLegsCount() {
        return 4;
    }
}

class Python extends AbstractAnimal { //для питона имплементация лапок уже не нужна
    @Override
    public String getType() {
        return "питончик";
    }
}