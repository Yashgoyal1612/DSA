import java.lang.reflect.Array;

public class EFArrayDemo {
  int arr[];
  public EFArrayDemo()
  {
    arr = new int[5];
    for (int i = 0; i <arr.length ; i++) {
      arr[i] = Integer.MIN_VALUE;
    }
  }
  // method to traverse the array
  public void traverse()
  {
    for (int res:arr) {
      System.out.println(res);
    }
  }
  // method to insert the values in the array
  public void insert(int index, int value )throws ArrayIndexOutOfBoundsException
  { // index = 1
    // value 56

      if(arr[index] == Integer.MIN_VALUE)
      {
          arr[index]= value;
      }
      else
      {
        System.out.println("already filled ");
      }

  }
  // method to print the specific value from the array
  public void getvalue(int index)
  {
    try
    {
      System.out.println(arr[index]);
    }catch(ArrayIndexOutOfBoundsException obj){
      System.out.println("invalid index");
    }
  }
  //search a value in the array
  public void search(int value)
  {
    for (int i = 0; i <arr.length ; i++) {
      if(arr[i] == value)
      {
        System.out.println("value found");
        return;
      }
    }
    System.out.println("value not found ");
  }
// method to delete the values from the array

//  public void delete (int value )
//  {
//
//  }

public void delete(int index)
{
  try
  {
    arr[index]= Integer.MIN_VALUE;
  }
  catch(ArrayIndexOutOfBoundsException obj)
  {
    System.out.println("invalid index");
  }
}
// method to delete the array
  public void deletearray()
  {
    arr= null;

  }

}

class EFTest
{
  public static void main(String[] args) {

    EFArrayDemo obj1 = new EFArrayDemo();
    try {
      obj1.traverse();
      obj1.insert(2, 56);
    }
    catch(ArrayIndexOutOfBoundsException obj)
    {
      System.out.println("invalid index");
    }
  }
}
