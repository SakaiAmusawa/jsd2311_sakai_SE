package reflect;

import reflect.annotations.AutoRunClass;

@AutoRunClass
public class Teacher {
    public String name;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
