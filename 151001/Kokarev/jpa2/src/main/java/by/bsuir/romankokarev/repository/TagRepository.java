package by.bsuir.romankokarev.repository;

import by.bsuir.romankokarev.model.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag,Integer> {
    Page<Tag> findAll(Pageable pageable);
}
