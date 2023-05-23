public class Teacher{

    private String name;
    private int teacherId;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    @Override
    public String toString() {
        return "Teacher [name=" + name + ", teacherId=" + teacherId + "]";
    }

    

}