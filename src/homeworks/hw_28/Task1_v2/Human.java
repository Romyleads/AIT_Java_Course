package homeworks.hw_28.Task1_v2;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

/*
Улучшенная версия на уроке
 */

public class Human {

    private int runSpeed;
    private int restTime;
    private String humanType;

    public Human() {
        this.runSpeed = 10;
        this.restTime = 15;
        this.humanType = "Обычный человек";
    }

    public Human(int runSpeed, int restTime, String humanType) {
        this.runSpeed = runSpeed;
        this.restTime = restTime;
        this.humanType = humanType;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    public String getHumanType() {
        return humanType;
    }

    public void setHumanType(String humanType) {
        this.humanType = humanType;
    }

    public void run() {
        System.out.printf("%s бежит со скоростью %d км/ч\n", humanType, runSpeed);
        rest();
    }

    public void rest() {
        System.out.printf("%s нужно %d минут отдыха\n", humanType, restTime);
    }

    @Override
    public String toString() {
        return "Human [runSpeed=" + runSpeed + ", restTime=" + restTime + ", humanType=" + humanType + "]";
    }
    /* */
    // @Override
    // public String toString() {
    //     StringBuilder sb =  new StringBuilder();
    //     sb.append("Human [runSpeed=").append(runSpeed)
    //     .append(", restTime=").append(restTime)
    //     .append(", humanType=").append(humanType)
    //     .append("]");
    //     return sb.toString();
    // }
    
}
