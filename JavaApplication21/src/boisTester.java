public class boisTester {
public static void main(String[] args) {
// Create a list
DoublyList doublyList = new DoublyList(new int[]{ 1,2,3,4,5,6,7,8,9,10 });
//Print the list
doublyList.showList();
//insertafter
doublyList.insertAfter(11, 12);
doublyList.insertAfter(12, 5);
doublyList.insertAfter(5, 5);
//Remove index
System.out.println("Remove element At index 5");
doublyList.remove(5);
doublyList.showList();
System.out.println("Remove key 8");
doublyList.removeKey(8);
doublyList.showList();

}

}