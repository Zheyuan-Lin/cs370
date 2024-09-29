package Controller;
import Service.TripFilterService;
import dao.TripFilters;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/trips")

public class TripFilterController {

    TripFilterService tripFilterService;


    // Get all trip filters
        @GetMapping
        public List<TripFilters> getAllTripFilters() {
            return tripFilterService.getAllTripFilters();
        }

        // Get a single trip filter by index
        @GetMapping("/{id}")
        public TripFilters getTripFiltersById(@PathVariable int id) {
               try {
                   return tripFilterService.getById(id);
               } catch (IndexOutOfBoundsException e) {
                   throw new IllegalArgumentException("Invalid trip filter ID");
                }
        }

        // Create a new trip filter
        @PostMapping
        public TripFilters createTripFilters(@RequestBody TripFilters newTripFilters) {
            tripFilterService.add(newTripFilters);
            return newTripFilters;
        }

        // Update an existing trip filter
        @PutMapping("/{id}")
        public TripFilters updateTripFilters(@PathVariable int id, @RequestBody TripFilters updatedTripFilters) {
            try {
                tripFilterService.set(id, updatedTripFilters);
                return updatedTripFilters;
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid trip filter ID");
            }
        }

        // Delete a trip filter
        @DeleteMapping("/{id}")
        public String deleteTripFilters(@PathVariable int id) {
            try {
                tripFilterService.remove(id);
                return "Trip filter removed";
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid trip filter ID");
            }
        }
    }
