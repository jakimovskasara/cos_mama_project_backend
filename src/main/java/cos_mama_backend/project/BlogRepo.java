package cos_mama_backend.project;

import java.util.List;

public interface BlogRepo {
    List<Blog> findAll();
    Blog findById(long id);
