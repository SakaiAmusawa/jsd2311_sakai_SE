package generice;

public class Demo1 {
    public static void main(String[] args) {
        //如果不指定泛型，那么即为默认的原型：object
        TransferObject transferObject = new TransferObject();
        transferObject.setSender("ZJW");
        transferObject.setReceiver("sakai");

        transferObject.setData("hello!");
        transferObject.setData(123);

        TransferObject<String> tString = new TransferObject<>();
        //tString.setData(123); //编译器 会自动检查实参类型是否符合泛型要求，不符合则不通过编译
        tString.setData("hello!");

        TransferObject<Integer> integer = new TransferObject<>();
        integer.setData(123);
        //integer.setData("hello!"); //编译不通过，与上同理

        //如果没有指定泛型 接受泛型返回值时也需要使用object 获取实际类型需要手动造型
        //String s = (String) transferObject.getData();//可能存在类造型异常

        String s1 = tString.getData();//获取时T自动转换为String
        System.out.println(s1);

        Integer i = integer.getData();
        System.out.println(i);

    }
}
