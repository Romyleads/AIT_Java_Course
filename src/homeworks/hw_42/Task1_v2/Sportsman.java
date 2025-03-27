package homeworks.hw_42.Task1_v2;

import java.util.Comparator;

/*** Author: Roman Romashko Date: 27.03.2025 ***/

public class Sportsman implements Comparable<Sportsman> {
    private String name;
    private int age;
    private double score;

    public Sportsman(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    // Естественный порядок: по имени
    @Override
    public int compareTo(Sportsman other) {
        return this.name.compareTo(other.name);
    }
}

/*
// Такая реализация будет работать НЕВЕРНО:
// При малой разнице очков результат может округлиться до 0
// Пример: 90.75 - 90.50 = 0.25 -> (int)0.25 = 0
//         91 - 90.50 = 0.5 -> (int)0.5 = 0

return (int) (s1.getScore() - s2.getScore());
*/

// Отдельный компаратор для сортировки по score
class SportsmanScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return Double.compare(s1.getScore(), s2.getScore());
    }
}




