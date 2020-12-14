public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList<T>(){
    super();
  }

  public NoNullArrayList<T>(startingCap){
    super(startingCap);
  }

  public boolean add(T element){
    if (element.equals(null)) {
      throw new IllegalArgumentException("Null is not a valid element");
    }
    super.add(element);
  }

}
