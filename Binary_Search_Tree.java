package Project;
import java.util.Scanner;
public class Binary_Search_Tree {
	Scanner sc = new Scanner(System.in);
    Node start = null;
    public Node getNode() {
        System.out.println("Enter Student Name: ");
        String name = sc.next();
        System.out.println("Enter Student Department: ");
        String department = sc.next();
        System.out.println("Enter Student CGPA: ");
        double CGPA = sc.nextDouble();
        int roll = (int) (Math.random() * 100) + 1;

        Node newNode = new Node();
        newNode.name = name;
        newNode.roll = roll;
        newNode.CGPA = CGPA;
        newNode.department = department;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }
    public void insertBST() {
        Node newNode = getNode();
        if (start == null) {
            start = newNode;
            System.out.println("Student record inserted.");
        } else {
            Node temp = start;
            while (true) {
                if (newNode.roll > temp.roll) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        System.out.println("Student record inserted.");
                        break;
                    } else {
                        temp = temp.right;
                    }
                }
                if (newNode.roll < temp.roll) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        System.out.println("Student record inserted.");
                        break;
                    } else {
                        temp = temp.left;
                    }
                }
            }
        }
    }
    public boolean searchBST(int roll) {
        Node temp = start;
        while (temp != null) {
            if (roll == temp.roll) {
                System.out.println("Student record found: ");
                System.out.println("Name: " + temp.name);
                System.out.println("Roll: " + temp.roll);
                System.out.println("CGPA: " + temp.CGPA);
                System.out.println("Department: " + temp.department);
                return true;
            } else if (roll < temp.roll) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return false;
    }
}
