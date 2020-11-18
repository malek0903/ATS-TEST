package tn.talan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.talan.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
