package __5_acess_modifiler_static_method_stattic_property.thuc_hanh.__1_acessmpdifier.__private;

public class Simple {
    public static void main(String[] args) {
        A obj=new A();

        System.out.println(obj.data);//Compile Time Error

        obj.msg();//Compile Time Error
    }
}
