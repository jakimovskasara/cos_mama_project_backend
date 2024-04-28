package cos_mama_backend.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlogTest {

    private Blog blog;
    private final long id = 1L;
    private final LocalDate date = LocalDate.of(2024, 4, 24);
    private final String author = "John Doe";
    private final String title = "My First Blog";
    private final String content = "Content of the blog.";

    @BeforeEach
    void setUp() {
        blog = new Blog(id, date, author, title, content);
    }

    @Test
    void testGetId() {
        assertEquals(id, blog.getId());
    }

    @Test
    void testGetDateOfCreation() {
        assertEquals(date, blog.getDateOfCreation());
    }

    @Test
    void testGetAuthor() {
        assertEquals(author, blog.getAuthor());
    }

    @Test
    void testGetTitle() {
        assertEquals(title, blog.getTitle());
    }

    @Test
    void testGetContent() {
        assertEquals(content, blog.getContent());
    }

    @Test
    void testSetId() {
        long newId = 2L;
        blog.setId(newId);
        assertEquals(newId, blog.getId());
    }

    @Test
    void testSetDateOfCreation() {
        LocalDate newDate = LocalDate.now();
        blog.setDateOfCreation(newDate);
        assertEquals(newDate, blog.getDateOfCreation());
    }

    @Test
    void testSetAuthor() {
        String newAuthor = "Jane Smith";
        blog.setAuthor(newAuthor);
        assertEquals(newAuthor, blog.getAuthor());
    }

    @Test
    void testSetTitle() {
        String newTitle = "My Second Blog";
        blog.setTitle(newTitle);
        assertEquals(newTitle, blog.getTitle());
    }

    @Test
    void testSetContent() {
        String newContent = "Updated content of the blog.";
        blog.setContent(newContent);
        assertEquals(newContent, blog.getContent());
    }

    @Test
    void testToString() {
        String expected = "Blog{id=" + id + ", dateOfCreation=" + date +
                ", author='" + author + '\'' + ", title='" + title + '\'' +
                ", content='" + content + '\'' + '}';
        assertEquals(expected, blog.toString());
    }
}