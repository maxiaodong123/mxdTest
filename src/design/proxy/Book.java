package design.proxy;

/**
 * Created by maxiaodong on 2017/3/5.
 */
public class Book {

   public void read(){
       System.out.println("read book");
   }

    public static void main(String[] args) {
        CGLibProxy proxy = new CGLibProxy();
        Book b = (Book) proxy.getProxy(Book.class);
        b.read();
    }
}
