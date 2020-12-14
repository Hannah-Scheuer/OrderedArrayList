import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCap){
    super(startingCap);
  }
}
