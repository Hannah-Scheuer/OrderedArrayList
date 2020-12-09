public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList<T>(){
    super(1);
  }

  public NoNullArrayList<T>(startingCap){
    super(startingCap);
  }

  public boolean add(T element){
    super.add(element);
  }

}
