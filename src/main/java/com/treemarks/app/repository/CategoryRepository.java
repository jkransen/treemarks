package com.treemarks.app.repository;

import com.treemarks.app.domain.Category;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Spring Data JPA repository for the Category entity.
 */
@SuppressWarnings("unused")
public interface CategoryRepository extends JpaRepository<Category,Long> {

    @Query("select category from Category category where category.owner.login = ?#{principal.username}")
    List<Category> findByOwnerIsCurrentUser();

    @Query("select distinct category from Category category left join fetch category.parents")
    List<Category> findAllWithEagerRelationships();

    @Query("select category from Category category left join fetch category.parents where category.id =:id")
    Category findOneWithEagerRelationships(@Param("id") Long id);

}
