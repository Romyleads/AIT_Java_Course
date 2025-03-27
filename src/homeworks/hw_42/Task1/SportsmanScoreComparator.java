package homeworks.hw_42.Task1;

import java.util.Comparator;

/*** Author: Roman Romashko Date: 27.03.2025 ***/


// Компаратор для сортировки по рейтингу (score)
class SportsmanScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return Integer.compare(s1.getScore(), s2.getScore());
    }
}


