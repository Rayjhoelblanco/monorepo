package katas;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class KatasTest {
  @Test void reverse_ok(){ assertEquals("cba", Katas.reverse("abc")); }
  @Test void palindrome_ok(){ assertTrue(Katas.isPalindrome("Anita lava la tina")); }
  @Test void cuenta_vocales(){ assertEquals(5, Katas.countVowels("Educación")); }
  @Test void unique_ok(){ assertEquals(List.of(1,2,3), Katas.unique(List.of(1,2,2,3,1))); }
  @Test void frecuencias_ok(){ assertEquals(2L, Katas.frequencies(List.of("a","b","a")).get("a")); }
}
