package QUIS2;

class team {
    String teamName;
    driver driver1;
    driver driver2;
    int totalPoints;

    team(String teamName, driver driver1, driver driver2) {
        this.teamName = teamName;
        this.driver1 = driver1;
        this.driver2 = driver2;
        this.totalPoints = 0;
    }

    void updatePoints() {
        this.totalPoints = driver1.points + driver2.points;
    }

    int getTotalPoints() {
        return totalPoints;
    }
    public String getTeamName() {
        return teamName;
    }

    public driver getDriver1() {
        return driver1;
    }

    public driver getDriver2() {
        return driver2;
    }
    public int getDriverCount() {
        return (driver1 != null ? 1 : 0) + (driver2 != null ? 1 : 0);
    }

    double getAverageLapTime() {
        return (driver1.getAverageLapTime() + driver2.getAverageLapTime()) / 2;
    }
}