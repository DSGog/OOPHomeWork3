package OOPHomework3.data;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private int currentIndex = 0;
    private final List<StudentGroup> studentGroups;

    public StreamIterator(Stream stream) {
        this.studentGroups = stream.getStudentGroups();
    }

    @Override
    public boolean hasNext() {
        return currentIndex < studentGroups.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException("No more elements in the iterator");
        }
        return studentGroups.get(currentIndex++);
    }
}
