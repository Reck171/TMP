package Template_Method;

public abstract class Aset {
    public void showPage() {
        System.out.println("Верхняя граница заголовка");
        showPageContent();
        System.out.println("Нижняя граница заголовка");
    }
    public abstract void showPageContent();

}
