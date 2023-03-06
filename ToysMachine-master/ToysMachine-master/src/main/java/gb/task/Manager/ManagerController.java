package gb.task.Manager;

import gb.task.ToyMachineApplication;

public class ManagerController {

    private final ToyMachineApplication main;
    private ToyManager toyManager;

    public ManagerController(ToyMachineApplication main) {
        this.main = main;
        this.initManager();
    }

    private void initManager() {
        this.toyManager = new ToyManager();
    }

    public ToyManager getToyManager() {
        return this.toyManager;
    }

    public ToyMachineApplication getMain() {
        return this.main;
    }
}
