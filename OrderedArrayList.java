import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCap){
    super(startingCap);
  }

  private int findIndex(T element){
    for (int i=0;i< size();i++){
      if (element> get(i)){
        return i;
      }
    }
    return size();
  }

  public boolean add(T element){
    return super.add(findIndex(element), element);
  }

  public void add(int index, T element){
    super.add(findIndex(element), element);
  }



}
