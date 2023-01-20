

import java.util.ArrayList;
import java.util.List;

// Single responsibility principle	
// Принцип единственной ответственности
// У класса есть предназначение
// https://youtu.be/GIIPo509Vpk?t=537

public class Ex001_1SRP {
    public static void main(String[] args) {
        Planner revengePlanner = new Planner();
        revengePlanner.addEntry("1");
        revengePlanner.removeEntry(0);
        revengePlanner.saveAllText("path");
        revengePlanner.loadFromDB("10.0.0.0","admin","1234");
    }
}

class Planner {

    List<String> entries = new ArrayList<>();

    public void addEntry(String text) {
        entries.add(text);
    } //добавить запись
    public void removeEntry(int index) {
        entries.remove(index);
    } //удалить запись
    @Override
    public String toString() {
        return String.join("\n", entries);
    } //может быть потребуется перегрузка

    public void saveAllText(String path) { //сохранить весть текст в файлик
        /// ошибки связанные с...
    }
    
    public void loadFromFile(String path) { //зазгрузить из файла
        /// ошибки связанные с...
    }

    public void loadFromDB(String url, String username, String password) { // загрузить из базы данных
        /// ошибки связанные с...
    }
}