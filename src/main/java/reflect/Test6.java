package reflect;

import java.io.File;

public class Test6 {
    public static void main(String[] args) throws Exception {
        Class c = Test6.class;
        String pack = c.getPackage().getName();
        File dir = new File(Test6.class.getResource(".").toURI());
        System.out.println(dir);

        //File[] files = dir.listFiles();
        //健壮性的提升
        File[] files = dir.listFiles(f -> f.getName().endsWith(".class"));
        for (int i = 0; i < files.length; i++) {
            int index = files[i].getName().indexOf(".");
            String name = files[i].getName().substring(0, index);
            System.out.println(name);

            Class cls = Class.forName(pack + "." + name);
            Object o = cls.newInstance();
            System.out.println(o);
        }
    }
}
