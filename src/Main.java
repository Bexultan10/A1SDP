public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.showActivity();

        developer.setActivity(new Training());
        developer.showActivity();

        developer.setActivity(new Programming());
        developer.showActivity();

        developer.setActivity(new Studying());
        developer.showActivity();

        developer.setActivity(new Trading());
        developer.showActivity();

        developer.setActivity(new Sleeping());
        developer.showActivity();
    }
} 