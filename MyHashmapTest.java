package hashmap;
import org.junit.Assert;
import org.junit.Test;

public class MyHashmapTest {

	@Test
	public void givenASentence_WordsAreAddedToList_ShouldReturnWordFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value==null) {
				value=1;
			} else {
				value=value+1;
			}
			myHashMap.add(word,value);
		}
		//int frequency = myHashMap.get("be");
		System.out.println(myHashMap);
		//Assert.assertEquals(2, frequency);
	}

	
}
