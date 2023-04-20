import java.util.LinkedList;

public class ArrayCollectionClass implements ArrayCollection{
    LinkedList<Integer>list=new LinkedList<Integer>();
    @Override
    public void add(int element){
        list.add(element);
    }
    @Override
    public int get(int index){
        return list.get(index);
    }
    @Override
    public void remove(int index){
        list.remove(index);
    }
    @Override
    public int findIndex(int element){
       return list.indexOf(element);
    }
    @Override
    public boolean contains(int element){
        return list.contains(element);
    }

    public LinkedList<Integer> getList() {
        return list;
    }

    public void setList(LinkedList<Integer> list) {
        this.list = list;
    }

    @Override
    public int size(){
    return list.size();
    }
}
