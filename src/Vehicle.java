public class Vehicle {
    private String type;
    private String mark;
    private String model;
    private int date;
    private int course;
    private String VINNumber;

    public Vehicle(String type, String mark, String model, int date, int course, String VINNumber) {
        this.type = type;
        this.mark = mark;
        this.model = model;
        this.date = date;
        this.course = course;
        this.VINNumber = VINNumber;
    }

    public Vehicle() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getVINNumber() {
        return VINNumber;
    }

    public void setVINNumber(String VINNumber) {
        this.VINNumber = VINNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date +
                ", course=" + course +
                ", VINNumber='" + VINNumber + '\'' +
                '}';
    }
}
