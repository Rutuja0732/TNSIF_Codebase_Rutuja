package com.onlineshoppingMain;

import com.onlineshopping.allservices.*;
import com.onlineshopping.entities.*;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductService productService = new ProductService();
        AdminService adminService = new AdminService();
        CustomerService customerService = new CustomerService();
        OrderService orderService = new OrderService();

        while (true) {
            System.out.println("\n1. Admin Menu\n2. Customer Menu\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    adminMenu(sc, productService, adminService, orderService);
                    break;
                case 2:
                    customerMenu(sc, productService, customerService, orderService);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }

    static void adminMenu(Scanner sc, ProductService ps, AdminService as, OrderService os) {
        while (true) {
            System.out.println("\nAdmin Menu:\n1. Add Product\n2. Remove Product\n3. View Products\n4. Create Admin\n5. View Admins\n6. Update Order Status\n7. View Orders\n8. Return");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Stock Quantity: ");
                    int qty = sc.nextInt();
                    ps.addProduct(new Product(id, name, price, qty));
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = sc.nextInt();
                    ps.removeProduct(removeId);
                    System.out.println("Product removed.");
                    break;

                case 3:
                    System.out.println("Products:");
                    for (Product p : ps.getAllProducts())
                        System.out.println(p);
                    break;

                case 4:
                    System.out.print("Enter Admin ID: ");
                    int aid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Admin Name: ");
                    String aname = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String aemail = sc.nextLine();
                    as.addAdmin(new Admin(aid, aname, aemail));
                    System.out.println("Admin created successfully!");
                    break;

                case 5:
                    for (Admin a : as.getAllAdmins())
                        System.out.println(a);
                    break;

                case 6:
                    System.out.print("Enter Order ID: ");
                    int oid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new status (Completed/Delivered/Cancelled): ");
                    String status = sc.nextLine();
                    Order o = os.getOrderById(oid);
                    if (o != null) {
                        o.setStatus(status);
                        System.out.println("Order status updated.");
                    } else {
                        System.out.println("Order not found.");
                    }
                    break;

                case 7:
                    for (Order ord : os.getAllOrders())
                        System.out.println(ord);
                    break;

                case 8:
                    return;
            }
        }
    }

    static void customerMenu(Scanner sc, ProductService ps, CustomerService cs, OrderService os) {
        while (true) {
            System.out.println("\nCustomer Menu:\n1. Create Customer\n2. View Customers\n3. Place Order\n4. View Orders\n5. View Products\n6. Return");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Username: ");
                    String cname = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String cemail = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();
                    cs.addCustomer(new Customer(cid, cname, cemail, address));
                    System.out.println("Customer created successfully!");
                    break;

                case 2:
                    for (Customer c : cs.getAllCustomers())
                        System.out.println(c);
                    break;

                case 3:
                    System.out.print("Enter Customer ID: ");
                    int customerId = sc.nextInt();
                    Customer cust = cs.getCustomerById(customerId);
                    if (cust == null) {
                        System.out.println("Customer not found.");
                        break;
                    }

                    ShoppingCart cart = cust.getShoppingCart();
                    while (true) {
                        System.out.print("Enter Product ID to add to order (or -1 to complete): ");
                        int pid = sc.nextInt();
                        if (pid == -1) break;
                        Product p = ps.getProductById(pid);
                        if (p == null) {
                            System.out.println("Product not found.");
                            continue;
                        }
                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();
                        if (quantity > p.getStockQuantity()) {
                            System.out.println("Not enough stock.");
                        } else {
                            cart.addProduct(p, quantity);
                        }
                    }

                    List<ProductQuantityPair> pqList = new ArrayList<>();
                    for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
                        pqList.add(new ProductQuantityPair(entry.getKey(), entry.getValue()));
                        entry.getKey().reduceStock(entry.getValue());
                    }

                    Order order = new Order(cust, pqList);
                    cust.addOrder(order);
                    os.addOrder(order);
                    cart.clearCart();
                    System.out.println("Order placed successfully!");
                    break;

                case 4:
                    System.out.print("Enter Customer ID: ");
                    int viewId = sc.nextInt();
                    Customer viewCust = cs.getCustomerById(viewId);
                    if (viewCust != null) {
                        for (Order ord : viewCust.getOrders())
                            System.out.println(ord);
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 5:
                    for (Product p : ps.getAllProducts())
                        System.out.println(p);
                    break;

                case 6:
                    return;
            }
        }
    }
}
