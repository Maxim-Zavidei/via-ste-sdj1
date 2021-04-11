import model.CdModel;
import model.CdModelManager;
import view.CdConsoleView;

public class TestCdApplication {
    public static void main(String[] args) {
        CdModel model = new CdModelManager();
        CdConsoleView view = new CdConsoleView(model);
        view.start();
    }
}
