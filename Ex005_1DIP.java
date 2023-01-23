
public class Ex005_1DIP {
    public static void main(String[] args) {
        Book book = new Book(); //имеется книга
        book.viewAuthor(); //нужно посмотреть кто является автором книги

    }
}

interface View {
    void print(String text);
}

class ConsoleView implements View { //класс который будет что то показывать
    public void print(String text) {
        String result = String.format("ConsoleView %s", text);
        System.out.println(result);
    }
}

class WinFormView implements View {
    public void print(String text) {
        String result = String.format("WinFormView %s", text);
        System.out.println(result);
    }
}

class Book {
    View view; //содержит экземпляр view

    int indexPage;

    public Book() { //инициализация происходит на уровне конструктора
        this.view = new ConsoleView(); //если завтра перестанет существовать ConsoleView, то перестанет существовать вся логика, что делать?
        indexPage = 1;
    }

    public void viewTitle() {
        view.print("Заголовок книги");
    }

    public void viewAuthor() {
        view.print("Авторы книги");
    }

    public void turnPage(int page) {
        if (page >= 1 && page <= 300)
            this.indexPage = page;
    }

    public void viewCurrentPage() {
        view.print(String.format("Страница: %s", indexPage));
    }
}