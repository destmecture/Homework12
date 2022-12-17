public class Main {
    public static void main(String[] args) {

        Author stephen = new Author("Stephen King");
        Book darkTower = new Book("Dark Tower",stephen, 2004);

        Author dan = new Author("Dan Brown");
        Book decPoint = new Book("Deception Point", dan, 2001);

        decPoint.setAge(2005);

        System.out.println(darkTower.getName()+", "+darkTower.getAuthorName()+", "+darkTower.getPublishingYear());
        System.out.println(decPoint.getName()+", "+decPoint.getAuthorName()+", "+decPoint.getPublishingYear());

    }
}