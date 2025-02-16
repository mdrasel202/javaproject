package student;

public class Student {
    private int id;
    private String name;
    private int className;
    private int age;
    private String classTeacher;
    private Double mark;

    public Student(int id, String name, int className, int age, String classTeacher, Double mark) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.age = age;
        this.classTeacher = classTeacher;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getClassName() {
        return className;
    }

    public int getAge() {
        return age;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public Double getMark() {
        return mark;
    }
}
