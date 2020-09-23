package __10_dsa_list.thuc_hanh._1_development_list_simple;

import java.util.Arrays;

/* -develope programes settings list use generic: */
public class MyList<E> {
    /*xác định phần tử trong danh sách, mặc định là : 0 */
    private int size = 0;
    /*Lưu số lượng phần tử tối đa trong danh sách, mặc định là : 10*/
    private static final int DEFAULT_CAPACITY = 10;
    /*Mảng đối tượng elements chứa các phần tử trong danh sách*/
    private Object elements[];

    public MyList() {
         elements = new Object[DEFAULT_CAPACITY];
    }

    /*tăng gấp đôi kích thước chứa các phần tử: */

    private void ensureCapa() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }

    /* - cài đặt phương thức add:
    *  - thêm phần tử vào cuối danh sách: */

    public void add(E e) {
         if(size == elements.length) {
             ensureCapa();
         }
         elements[size++] = e;
    }

    /* cài đặt phương thức get:
    * Phương thức get() trả về phần tử thứ i trong danh sách: */

    public E get(int i) {
        if(i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index : " + i + ", Size " + size);
        }
        System.out.println(size);
        return (E) elements[i];
    }
}
