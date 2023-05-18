package Template_Method;

public class Run {
    public static void main(String[] args) {
        Aset welcomePage = new Main();
        Aset newsPage = new Lessons();

        welcomePage.showPage();

        System.out.println("--------------------");

        newsPage.showPage();

    }
}
