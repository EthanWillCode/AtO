package org.launchcode.AtOwebpage.Controllers.data;

import org.launchcode.AtOwebpage.models.ForumPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForumRepository extends CrudRepository<ForumPost, Integer> {
}
