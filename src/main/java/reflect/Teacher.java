package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

@AutoRunClass
public class Teacher {
    public String name;

    @AutoRunMethod
    public void teach() {
        System.out.println("老师在讲课");
    }

    public void sleep() {
        System.out.println("老师在睡觉");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
