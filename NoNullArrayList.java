import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCap){
    super(startingCap);
  }

  public boolean add(T element){
    if (element.equals(null)) {
      throw new IllegalArgumentException("Null is not a valid element");
    }
    super.add(element);
  }

  public void add(int index, T element){
    if (element.equals(null)) {
      throw new IllegalArgumentException("Null is not a valid element");
    }
    super.add(index, element);
  }

  public T set(int index, String element){
    if (element.equals(null)) {
      throw new IllegalArgumentException("Null is not a valid element");
    }
    super.set(index, element);
  }

}
