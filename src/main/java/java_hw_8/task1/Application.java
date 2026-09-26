package java_hw_8.task1;

public class Application {

    public static void main(String[] args) {

        Warehouse<String> warehouse = new Warehouse<>();

        System.out.println("Is warehouse empty: " + warehouse.isEmpty());

        warehouse.addItem("Laptop");
        warehouse.addItem("Phone");
        warehouse.addItem("Tablet");

        System.out.println("Items count: " + warehouse.getItemCount());

        System.out.println("View items:");
        System.out.println(warehouse.viewItems());

        System.out.println("Retrieve all items:");
        System.out.println(warehouse.retrieveAll());

        System.out.println("Is warehouse empty after retrieveAll: "
                + warehouse.isEmpty());

        warehouse.addItem("Monitor");
        warehouse.addItem("Keyboard");

        System.out.println("Items before clear:");
        System.out.println(warehouse.viewItems());

        warehouse.clear();

        System.out.println("Items after clear:");
        System.out.println(warehouse.viewItems());
    }
}
