package OOPHomework3.service;

import OOPHomework3.data.Stream;
import OOPHomework3.data.StreamComparator;

import java.util.List;

public class StreamService {
    public void sortStreams(List<Stream> streams) {
        streams.sort(new StreamComparator());
    }
}