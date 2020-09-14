
package javaapplication49;

import java.util.Comparator;

class IDComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.id-o2.id;
    }
}
class ScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o2.getScore()-o1.getScore());
    }
}
class FinalScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o2.finalex-o1.finalex);
    }
}