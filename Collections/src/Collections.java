import java.util.*;
public class Collections {
public static void main(String[] args){
TreeSet<String> treeset=new TreeSet<>();
//adding elements to the treeSet
treeset.add("she");
treeset.add("has");
treeset.add("beautiful");
treeset.add("eyes");
//Iterating TreeSet using Iterator
Iterator<String> it=treeset.iterator();
while(it.hasNext()){
System.out.println(it.next());
}

//removing element using remove()
treeset.remove("she");
System.out.println("***after removing an element from treeset****");
System.out.println(set);


//headSet() method gives the value less than equal to the mentioned element
System.out.println("***headSet method gives elements which are less than the given");
System.out.println(treeset.headSet("has"));

//tailSet() method gives the value greater than equal to the mentioned element
System.out.println("***tailSet method gives elements which are greater than the given");
System.out.println(treeset.tailSet("eyes"));

//size() returns an integer denoting no of elements in the TreeSet
System.out.println("***The size of treeset is*** ");
System.out.println(treeset.size());

//pollFirst() gives least element
System.out.println("***pollfirst method retrieves and removes lowest element");
System.out.println(treeset.pollFirst());

}
}