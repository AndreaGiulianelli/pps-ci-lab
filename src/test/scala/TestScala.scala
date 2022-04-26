import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class TestScala:
  @Test
  def testScalaHelloWorld(): Unit =
    assertEquals("DAMA", HelloWorldFromScala.getName())
