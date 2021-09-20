package Lesson01;

public class Homework01 {
    public static void main(String[] args) {

        Course[] currentCourse = new Course[3];
        currentCourse[0] = new Course(1000, 1200, 900);
        currentCourse[1] = new Course(1000, 1200, 900);
        currentCourse[2] = new Course(1000, 1200, 900);


        Team teamMates[] = new Team[4];
        teamMates[0] = new Team("Team1", "Pavel", 1010);
        teamMates[1] = new Team("Team1", "Oleg", 990);
        teamMates[2] = new Team("Team1", "Ivan", 1200);
        teamMates[3] = new Team("Team1", "Petr", 1300);


        System.out.println("Участники Соревнований");
        for (int i = 0; i < teamMates.length; i++) {
            teamMates[i].printData();
        }
        System.out.println("Победители соревнований");
        for (int i = 0; i < teamMates.length; i++) {
            for (int j = 0; j < currentCourse.length; j++) {
                if (teamMates[i].curentDistanse >= currentCourse[j].runDistanse)
                    teamMates[i].printData();

            }
        }
    }
}

