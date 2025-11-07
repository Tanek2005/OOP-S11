class Course {
    private String courseName;
    private int duration; 

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static void main(String[] args) {
        Course c1 = new Course();
        c1.setCourseName("Java Programming");
        c1.setDuration(6);

        System.out.println("Course Name: " + c1.getCourseName());
        System.out.println("Duration: " + c1.getDuration() + " months");
    }
}