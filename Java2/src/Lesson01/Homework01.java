package Lesson01;

public class Homework01 {
    public static void main(String[] args) {

        Course[] currentCourse = new Course[3];
        currentCourse[0] = new Course(1000, 1200, 900);
        currentCourse[1] = new Course(1000, 1200, 900);
        currentCourse[2] = new Course(1000, 1200, 900);


        Team[] teamMates = new Team[4];
        teamMates[0] = new Team("Team1", "Pavel", 1010);
        teamMates[1] = new Team("Team1", "Oleg", 990);
        teamMates[2] = new Team("Team1", "Ivan", 1200);
        teamMates[3] = new Team("Team1", "Petr", 1300);


        System.out.println("Участники Соревнований");
        for (Team teamMate : teamMates) {
            teamMate.printData();
        }
        System.out.println("Победители соревнований");
        for (Team teamMate : teamMates) {
            for (Course course : currentCourse) {
                if (teamMate.curentDistanse >= course.runDistanse)
                    teamMate.printData();

            }
        }
    }
}

