import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayCollectionClass collectionClass=new ArrayCollectionClass();
        int choice;
        do{
        System.out.println("Menu:");
        System.out.println("1-Add element");
        System.out.println("2-Get element");
        System.out.println("3-Remove element");
        System.out.println("4-Find index element");
        System.out.println("5-Contains");
        System.out.println("6-Size");
        System.out.println("7-List");
        System.out.println("0-Exit");
        choice=scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Add element:");
                collectionClass.add(scan.nextInt());
                break;
            case 2:
                System.out.println("Get element(index):");
                System.out.println("Element:"+collectionClass.get(scan.nextInt()));
                break;
            case 3:
                System.out.println("Remove(index):");
                collectionClass.remove(scan.nextInt());
                System.out.println("List:"+collectionClass.getList());
                break;
            case 4:
                System.out.println("Find Index:");
                System.out.println("Index:"+collectionClass.findIndex(scan.nextInt()));
                break;
            case 5:
                System.out.println("Contains:");
                System.out.println(collectionClass.contains(scan.nextInt()));
                break;
            case 6:
                System.out.println("Size:"+collectionClass.size());
                break;
            case 7:
                System.out.println("List:"+collectionClass.getList());
                break;
        }
        }while (choice!=0);
        scan.close();

    }
}
