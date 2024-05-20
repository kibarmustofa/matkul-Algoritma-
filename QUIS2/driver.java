package QUIS2;

class driver {

    String name;
    int points;
    double[] lapTimes;

    driver(String name) {
        this.name = name;
        this.points = 0;
        this.lapTimes = new double[3]; // Q1, Q2, Q3
    }
  
    public int getPoints() {
        return points;
    }
    void addPoints(int points) {
        this.points += points;
    }
    public String getName() {
        return name;
    }
    void setLapTime(int session, double lapTime) {
        if (session >= 0 && session < lapTimes.length) {
            this.lapTimes[session] = lapTime;
        } else {
            System.out.println("Invalid session index: " + session);
        }
    }

    double getLapTime(int session) {
        if (session >= 0 && session < lapTimes.length) {
            return this.lapTimes[session];
        } else {
            System.out.println("Invalid session index: " + session);
            return Double.MAX_VALUE; // return a large value to indicate an error
        }
    }

    double getAverageLapTime() {
        double totalLapTime = 0;
        for (double lapTime : lapTimes) {
            totalLapTime += lapTime;
        }
        return totalLapTime / lapTimes.length;
    }
}