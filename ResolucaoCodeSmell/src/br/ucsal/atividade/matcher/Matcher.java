package br.ucsal.atividade.matcher;

public class Matcher {
    
	public Matcher() {}
   
    public boolean match(int[] expected, int[] actual, 
        int clipLimit, int delta) 
    {
    	if (length(expected, actual)) {
			clipLarge(actual, clipLimit);
			return withinDelta(actual, expected, delta);
		}
    	return false;
    }
    
    private boolean length(int[] expected, int[] actual) {
    	if (actual.length != expected.length) {
            return false;
    	}
    	return true;
    }
    
    private void clipLarge(int[] actual, int clipLimit) {
    	for (int i = 0; i < actual.length; i++)
            if (actual[i] > clipLimit)
                actual[i] = clipLimit;
    }
    
    private boolean withinDelta(int[] actual, int[] expected, int delta) {
    	for (int i = 0; i < actual.length; i++)
            if (Math.abs(expected[i] - actual[i]) > delta) {
                return false;
            }
        return true;
    }
}