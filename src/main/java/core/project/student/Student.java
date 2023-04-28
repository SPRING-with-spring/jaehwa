package core.project.student;

public class Student {
    private Long id;
    private String name;
    private int score;
    private Grade grade;
    private int percentile;

    public Student(Long id, String name, int score, Grade grade, int percentile) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.grade = grade;
        this.percentile = percentile;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public int getPercentile() {
        return percentile;
    }

    public void setPercentile(int percentile) {
        this.percentile = percentile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", grade=" + grade +
                ", percentile=" + percentile +
                '}';
    }
}
