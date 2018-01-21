package proxyprint;

/**
 * @author ек╥Е
 * @date 2018/1/20 обнГ6:57
 */
public class PrintProxy implements PrintAble {

    private String name;

    private Printer printer;

    public String getPrintName() {
        return name;
    }

    public void setPrintName(String name) {
        this.name = name;
    }

    public void print() {

    }

    private synchronized void realize() {
        if (printer == null) {
            printer = new Printer();
        }
    }
}
