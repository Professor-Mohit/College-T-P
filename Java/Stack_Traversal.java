// if i click 1 push element in stack
// if i click 2 pop element from stack
// if i click 3 display element in stack.
// if i click 4 then exit.

import java.util.Stack;
import java.util.Scanner;
public class Stack_Traversal {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Push element in stack");
            System.out.println("2. Pop element from stack");
            System.out.println("3. Display element in stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        int poppedElement = stack.pop();
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;
                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Elements in stack: " + stack);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);
        sc.close();
    }
}
