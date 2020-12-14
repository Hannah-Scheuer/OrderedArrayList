import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCap){
    super(startingCap);
  }

  private int findIndex(T element){
    for (int i=0;i< size();i++){
      if (element.compareTo(get(i))>0){
        return i;
      }
    }
    return size();
  }

  public boolean add(T element){
    super.add(findIndex(element), element);
    return true;
  }

  public void add(int index, T element){
    super.add(findIndex(element), element);
  }

  public T set(int index, T element){
    T removed = super.remove(index);
    add(element);
    return removed;
  }



}
