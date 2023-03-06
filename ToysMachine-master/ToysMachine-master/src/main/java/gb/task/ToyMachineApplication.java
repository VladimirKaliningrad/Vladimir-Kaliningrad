package gb.task;

import gb.task.Manager.ManagerController;
import gb.task.Models.Toy;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ToyMachineApplication {

    private ManagerController controller;
    public static int REPEAT_MESSAGE = 0;

    public ToyMachineApplication() {
        this.sendEnableText();
        this.initController();
        this.loadToys();
    }

    public void run() {
        Toy winnerToy = this.getController().getToyManager().getRandomToy();
        System.out.println("--------------------------------------------------------");
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        ses.schedule(() -> System.out.println("╔═══╗───╔══╗───╔══╗───╔═══╗───╔╗╔╗───╔═══╗───╔╗╔══╗───╔══╗\n" +
                "╚══╗║───║╔╗║───║╔═╝───║╔═╗║───║║║║───╚══╗║───║║║╔═╝───║╔╗║"), 1, TimeUnit.SECONDS);
        ses.schedule(() -> System.out.println("─╔═╝║───║╚╝║───║║─────║╚═╝║───║╚╝║────╔═╝║───║╚╝║─────║╚╝║\n" +
                "─╚═╗║───║╔╗║───║║─────║╔══╝───╚═╗║────╚═╗║───║╔╗║─────║╔╗║"), 2, TimeUnit.SECONDS);
        ses.schedule(() -> System.out.println("╔══╝║───║║║║───║║─────║║───────╔╝║───╔══╝║───║║║╚═╗───║║║║\n" +
                "╚═══╝───╚╝╚╝───╚╝─────╚╝───────╚═╝───╚═══╝───╚╝╚══╝───╚╝╚╝"), 3, TimeUnit.SECONDS);
        ses.schedule(() -> System.out.println("--------------------------------------------------------\n" +
                "Ваш выйгрыш: " + winnerToy.getName() +
                "\n--------------------------------------------------------"), 4, TimeUnit.SECONDS);
        ses.shutdown();
    }


    public void loadToys() {
        this.getController().getToyManager().addToy(1, "медвежонок", 1, 0.25);
        this.getController().getToyManager().addToy(2, "крыска", 1, 0.25);
        this.getController().getToyManager().addToy(3, "робот", 1, 0.25);
        this.getController().getToyManager().addToy(4, "машина", 1, 0.25);
        this.getController().getToyManager().addToy(5, "ничего", 1, 1.0);
    }

    public void initController() {
        this.controller = new ManagerController(this);
    }

    public void sendEnableText() {
        System.out.println("███─████─██─██─███────█───█─████─████─█──█─███─█──█─███\n" +
                "─█──█──█──███──█──────██─██─█──█─█──█─█──█──█──██─█─█──\n" +
                "─█──█──█───█───███────█─█─█─████─█────████──█──█─██─███\n" +
                "─█──█──█───█─────█────█───█─█──█─█──█─█──█──█──█──█─█──\n" +
                "─█──████───█───███────█───█─█──█─████─█──█─███─█──█─███");
    }

    public ManagerController getController() {
        return this.controller;
    }
}
