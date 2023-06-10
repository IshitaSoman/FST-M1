package Activities;

abstract class Book {
    protected String title;

    public abstract void setTitle(String title);

    public String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    @Override
    public void setTitle(String title) {
        this.title = title;
    }
}

public class Activity5 {
    public static void main(String[] args) {
        Book newNovel = new MyBook();
        newNovel.setTitle("The Great Gatsby");

        System.out.println("Book title: " + newNovel.getTitle());
    }
}
