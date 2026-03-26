public class Homework8Main {
    public static void main(String[] args) {

        // create three employee objects with different names and salaries.
        ///// ----------- Problem 1: Employee Testing ----------- /////
        Employee e1 = new Employee("Alice", 5000.0);
        Employee e2 = new Employee("Bob", 6500.0);
        Employee e3 = new Employee("Charlie", 5500.0);

        // this will display the details of all the employees.
        System.out.println("Employee Details:");
        e1.display();
        e2.display();
        e3.display();

        // this will update Alice's salary and display the updated information.
        System.out.println("\nAfter updating Alice's salary:");
        e1.setSalary(5200.0);
        e1.display();

        // print the total number of employees that was created.
        Employee.printTotalEmployees();

        ///// ----------- Problem 2: Product and Cart Testing ----------- /////
        // create several product objects with the names and prices.
        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Phone", 800.0);
        Product p3 = new Product("Mouse", 50.0);
        Product p4 = new Product("Keyboard", 100.0);

        // we create two cart objects to store products.
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        // then we add products to the first cart.
        cart1.addProduct(p1);
        cart1.addProduct(p3);

        // then we add products to the second cart.
        cart2.addProduct(p2);
        cart2.addProduct(p4);

        // this is to display the content and toatl price of each cart.
        cart1.showCart();
        cart2.showCart();

        // this will print the total number of carts that was created.
        Cart.printTotalCartNumber();

        // this is to show original price of the laptop, and update it then display the new price. 
        System.out.println("Original Laptop price: $" + p1.getPrice());
        p1.setPrice(1000.0);
        System.out.println("Updated Laptop price: $" + p1.getPrice());
    }
}