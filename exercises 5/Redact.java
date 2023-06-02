package exercises;

public class Redact 
{
		public Redact redact(String[] words) {
			String out = this.text;
			for(String word : words) {		
				out = out.replaceAll(word, "_".repeat(word.length()));
			}
			return new Redact(out);
		}
}

