package course;

import com.hanendra.development.course.services.CourseServiceImpl;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CourseServiceTests {

  private CourseServiceImpl courseService;

  @BeforeEach
  public void initTests(){
    courseService = new CourseServiceImpl();
  }

  @Test
  public void testGetCourse(){
    System.out.println(courseService.getCourse(100).getCourseDescription());
    assertEquals(100, courseService.getCourse(100).getCourseId());
  }

  @Test
  public void testGetNonExistingCourse(){
    System.out.println(courseService.getCourse(1000));
    assertThrows(Exception.class, ()->courseService.getCourse(1000));

  }

}
