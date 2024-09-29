package Service;

import dao.TripFilters;

import java.util.List;

public interface TripFilterService {
    List<TripFilters> getAllTripFilters();

    TripFilters getById(int id);

    void remove(int id);

    void set(int id, TripFilters updatedTripFilters);

    void add(TripFilters newTripFilters);
}
