package QUIS2;

class Node {
    team team;
    Node next;

    Node(team team) {
        this.team = team;
        this.next = null;
    }
}

public class quarterSLL {
    Node head;
    Node tail;

    quarterSLL() {
        head = null;
        tail = null;
    }

    void addTeam(team team) {
        Node newNode = new Node(team);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void addFirst(team team) {
        Node newNode = new Node(team);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(team team) {
        Node newNode = new Node(team);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void updateTeamPoints(String teamName, int pointsDriver1, int pointsDriver2) {
        Node temp = head;
        while (temp != null) {
            if (temp.team.teamName.equals(teamName)) {
                temp.team.driver1.addPoints(pointsDriver1);
                temp.team.driver2.addPoints(pointsDriver2);
                temp.team.updatePoints();
                break;
            }
            temp = temp.next;
        }
    }

    void updateDriverLapTime(String driverName, int session, double lapTime) {
        Node current = head;
        while (current != null) {
            if (current.team.driver1.name.equals(driverName)) {
                current.team.driver1.setLapTime(session, lapTime);
                break;
            } else if (current.team.driver2.name.equals(driverName)) {
                current.team.driver2.setLapTime(session, lapTime);
                break;
            }
            current = current.next;
        }
    }
    void sortTeamsByPoints() {
        if (head == null || head.next == null) {
            return; 
        }
    
        boolean swapped;
        Node current;
        Node last = null;
    
        do {
            swapped = false;
            current = head;
    
            while (current.next != last) {
                Node nextNode = current.next;
    
                if (current.team.getTotalPoints() < nextNode.team.getTotalPoints()) {
                    team temp = current.team;
                    current.team = nextNode.team;
                    nextNode.team = temp;
                    swapped = true;
                }
    
                current = current.next;
            }
            last = current;
        } while (swapped);
    }
    void sortTeamsByLapTimes(int session) {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        Node current;
        Node last = null;

        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                Node nextNode = current.next;

                if (compareLapTimes(current.team, nextNode.team, session) > 0) {
                    team temp = current.team;
                    current.team = nextNode.team;
                    nextNode.team = temp;
                    swapped = true;
                }

                current = current.next;
            }
            last = current;
        } while (swapped);
    }

    private int compareLapTimes(team team1, team team2, int session) {
        double lapTime1 = getFastestLapTime(team1, session);
        double lapTime2 = getFastestLapTime(team2, session);
        return Double.compare(lapTime1, lapTime2);
    }

    private double getFastestLapTime(team team, int session) {
        double fastest = Double.MAX_VALUE;
        double lapTime = team.driver1.getLapTime(session) + team.driver2.getLapTime(session);
        if (lapTime < fastest) {
            fastest = lapTime;
        }
        return fastest;
    }

    
    void eliminateSlowestDrivers(int numberOfEliminations, int sessionIndex) {
        for (int i = 0; i < numberOfEliminations; i++) {
            if (head == null) return;

            Node slowestPrev = null, slowest = head, current = head, prev = null;
            while (current != null) {
                if (current.team.getDriver1().getLapTime(sessionIndex) + current.team.getDriver2().getLapTime(sessionIndex) >
                        slowest.team.getDriver1().getLapTime(sessionIndex) + slowest.team.getDriver2().getLapTime(sessionIndex)) {
                    slowest = current;
                    slowestPrev = prev;
                }
                prev = current;
                current = current.next;
            }
            if (slowestPrev == null) {
                head = head.next;
            } else {
                slowestPrev.next = slowest.next;
            }
        }
    }
    public void simulateQualification() {
        System.out.println("HASIL KUALIFIKASI Q1");
        simulateSession("Q1", 5);
    
        System.out.println("\nHASIL KUALIFIKASI Q2");
        simulateSession("Q2", 5);
    
        System.out.println("\nHASIL KUALIFIKASI Q3");
        simulateSession("Q3", 0);
    }
    
    private void simulateSession(String session, int eliminationLimit) {
        int sessionIndex = session.equals("Q1") ? 0 : (session.equals("Q2") ? 1 : 2);
        eliminateSlowestDrivers(sessionIndex, eliminationLimit); 
        sortTeamsByLapTimes(sessionIndex);
        printQualificationStandings(session, sessionIndex, eliminationLimit);
    }
    
    p
    
    void printTeamsByLapTimes(int sessionIndex) {
        Node temp = head;
        int position = 1;
        while (temp != null) {
            team team = temp.team;
            System.out.printf("POS %d: %s\n", position, team.getTeamName());
            System.out.println("\tDriver 1: " + team.getDriver1().getName());
            System.out.println("\tLap Times driver 1:");
            for (int i = 0; i <= sessionIndex; i++) {
                System.out.printf("\t\tSession %d: %.3f\n", i+1, team.getDriver1().getLapTime(i));
            }
            System.out.println("\tDriver 2: " + team.getDriver2().getName());
            System.out.println("\tLap Times driver 2:");
            for (int i = 0; i <= sessionIndex; i++) {
                System.out.printf("\t\tSession %d: %.3f\n", i+1, team.getDriver2().getLapTime(i));
            }
            temp = temp.next;
            position++;
        }
    }
    void printTeams() {
        Node temp = head;
        while (temp != null) {
            team team = temp.team;
            System.out.println("Team: " + team.teamName + ", Total Points: " + team.getTotalPoints());
            System.out.println("\tDriver 1: " + team.driver1.name + " - Points: " + team.driver1.getPoints());
            System.out.println("\tDriver 2: " + team.driver2.name + " - Points: " + team.driver2.getPoints());
            temp = temp.next;
        }
    }
}