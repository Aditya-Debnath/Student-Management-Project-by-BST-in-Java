package Project;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("<--Welcome to Student Record Management System!-->");
        Scanner sc = new Scanner(System.in);
        Binary_Search_Tree BST = new Binary_Search_Tree();
        while (true) {
            System.out.println("1. Insert Student Record");
            System.out.println("2. Search Student Record");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    BST.insertBST();
                    break;
                case 2:
                	System.out.println("Total students: " + countNodes(BST.start));
                    System.out.println("Roll numbers: ");
                    printRolls(BST.start);
                    System.out.println();
                    System.out.print("Enter roll number to search: ");
                    int roll = sc.nextInt();
                    if (BST.searchBST(roll)) {
                        System.out.println("Student record found.");
                    } else {
                        System.out.println("Student record not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.out.println("<--Thank you-->");
                    System.out.println("Total students: " + countNodes(BST.start));
                    System.out.print("Roll numbers: ");
                    printRolls(BST.start);
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
	}
	public static int countNodes(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.left) + countNodes(node.right);
        }
    }
    public static void printRolls(Node node) {
        if (node != null) {
            printRolls(node.left);
            System.out.print(node.roll + " ");
            printRolls(node.right);
        }
	}
}
